package com.zdy.biz.siteparameter.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.zdy.biz.siteparameter.dao.ISiteParameterDao;
import com.zdy.dubbo.api.service.siteparameter.ISiteParameterService;
import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.siteparameter.CreateSiteParameterReq;
import com.zdy.dubbo.dto.siteparameter.SiteParameterReq;
import com.zdy.dubbo.dto.siteparameter.SiteParameterResp;
import com.zdy.dubbo.dto.siteparameter.ModifySiteParameterReq;
import com.zdy.dubbo.model.siteparameter.SiteParameter;

import annotation.ReadDataSource;
import annotation.WriteDataSource;


@Service("siteParameterService")
public class SiteParameterServiceImpl implements ISiteParameterService {

	@Resource
	private ISiteParameterDao siteParameterDao; 	

	@ReadDataSource
	@Override
	public ServiceResult<BaseList<SiteParameterResp>> findSiteParameterListByPageNo(SiteParameterReq req) {
		ServiceResult<BaseList<SiteParameterResp>> result = new ServiceResult<BaseList<SiteParameterResp>>();
		if (req == null) {
			return result.error("查询条件不能为空");
		}

		List<SiteParameter> baseList = siteParameterDao.findList(req.toSiteParameter());
		int totalRows = siteParameterDao.count(req.toSiteParameter());
		int pageSize = req.getPageSize();
		int totalPage = totalRows % pageSize > 0 ? totalRows / pageSize + 1 : totalRows / pageSize + 1;

		List<SiteParameterResp> list = new ArrayList<SiteParameterResp>();
		if (!CollectionUtils.isEmpty(baseList)) {
			for (SiteParameter temp : baseList) {
				if (temp == null) {
					continue;
				}
				list.add(new SiteParameterResp(temp));
			}
		}

		BaseList<SiteParameterResp> siteParameterList = new BaseList<SiteParameterResp>();
		siteParameterList.setList(list);
		siteParameterList.setCurPage(req.getPage());
		siteParameterList.setPageSize(pageSize);
		siteParameterList.setTotalPage(totalPage);
		siteParameterList.setTotalRows(totalRows);
		return result.success(siteParameterList);
	}
	@WriteDataSource
	@Transactional
	@Override
	public ServiceResult<SiteParameterResp> save(CreateSiteParameterReq req) {
		ServiceResult<SiteParameterResp> result = new ServiceResult<SiteParameterResp>();
		if (req == null) {
			return result.error("保存对象不能为空");
		}
		SiteParameter d = req.toSiteParameter();

		int count = siteParameterDao.save(d);
		if (count == 0) {
			return result.error("保存失败");
		}
		return result.success();
	}
	
	@WriteDataSource
	@Transactional
	@Override
	public ServiceResult<SiteParameterResp> delete(SiteParameterReq req) {
		ServiceResult<SiteParameterResp> result = new ServiceResult<SiteParameterResp>();
		if (req == null || ObjectUtils.isEmpty(req.getIds())) {
			return result.error("删除条件不能为空");
		}

		int count = siteParameterDao.delete(req.toSiteParameter());
		if (count == 0) {
			return result.error("删除失败");
		}
		return result.success();
	}
	
	@WriteDataSource
	@Transactional
	@Override
	public ServiceResult<SiteParameterResp> update(ModifySiteParameterReq req) {

		ServiceResult<SiteParameterResp> result = new ServiceResult<SiteParameterResp>();
		if (req == null) {
			return result.error("修改条件不能为空");
		}
		int count = siteParameterDao.update(req.toSiteParameter());
		if (count == 0) {
			return result.error("修改失败");
		}
		return result.success();
	}

	@Override
	public ServiceResult<SiteParameterResp> deleteById(SiteParameterReq req) {

		return null;
	}

	@ReadDataSource
	@Override
	public ServiceResult<SiteParameterResp> getById(SiteParameterReq req) {
		ServiceResult<SiteParameterResp> result = new ServiceResult<SiteParameterResp>();
		if (req == null || req.getId() == null) {
			return result.error("查询条件不能为空");
		}
		SiteParameter SiteParameter = siteParameterDao.getById(req.getId());
		if(SiteParameter == null || SiteParameter.getId() == null){
			return result.error("获取失败");
		}
		return result.success(new SiteParameterResp(SiteParameter));
	}

	
}
