package com.zdy.biz.links.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import com.zdy.biz.links.dao.ILinksDao;
import com.zdy.dubbo.api.service.links.ILinksService;
import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.links.CreateLinksReq;
import com.zdy.dubbo.dto.links.LinksReq;
import com.zdy.dubbo.dto.links.LinksResp;
import com.zdy.dubbo.dto.links.ModifyLinksReq;
import com.zdy.dubbo.model.links.Links;

import annotation.ReadDataSource;
import annotation.WriteDataSource;

@Service("linksService")
public class LinksServiceImpl implements ILinksService {

	@Resource
	private ILinksDao linksDao; 	

	@ReadDataSource
	@Override
	public ServiceResult<BaseList<LinksResp>> findLinksListByPageNo(LinksReq req) {
		ServiceResult<BaseList<LinksResp>> result = new ServiceResult<BaseList<LinksResp>>();
		if (req == null) {
			return result.error("查询条件不能为空");
		}

		List<Links> baseList = linksDao.findList(req.toLinks());
		int totalRows = linksDao.count(req.toLinks());
		int pageSize = req.getPageSize();
		int totalPage = totalRows % pageSize > 0 ? totalRows / pageSize + 1 : totalRows / pageSize + 1;

		List<LinksResp> list = new ArrayList<LinksResp>();
		if (!CollectionUtils.isEmpty(baseList)) {
			for (Links temp : baseList) {
				if (temp == null) {
					continue;
				}
				list.add(new LinksResp(temp));
			}
		}

		BaseList<LinksResp> linksList = new BaseList<LinksResp>();
		linksList.setList(list);
		linksList.setCurPage(req.getPage());
		linksList.setPageSize(pageSize);
		linksList.setTotalPage(totalPage);
		linksList.setTotalRows(totalRows);
		return result.success(linksList);
	}
	@WriteDataSource
	@Transactional
	@Override
	public ServiceResult<LinksResp> save(CreateLinksReq req) {
		ServiceResult<LinksResp> result = new ServiceResult<LinksResp>();
		if (req == null) {
			return result.error("保存对象不能为空");
		}
		Links d = req.toLinks();

		int count = linksDao.save(d);
		if (count == 0) {
			return result.error("保存失败");
		}
		return result.success();
	}
	
	@WriteDataSource
	@Transactional
	@Override
	public ServiceResult<LinksResp> delete(LinksReq req) {
		ServiceResult<LinksResp> result = new ServiceResult<LinksResp>();
		if (req == null || ObjectUtils.isEmpty(req.getIds())) {
			return result.error("删除条件不能为空");
		}

		int count = linksDao.delete(req.toLinks());
		if (count == 0) {
			return result.error("删除失败");
		}
		return result.success();
	}
	
	@WriteDataSource
	@Transactional
	@Override
	public ServiceResult<LinksResp> update(ModifyLinksReq req) {

		ServiceResult<LinksResp> result = new ServiceResult<LinksResp>();
		if (req == null) {
			return result.error("修改条件不能为空");
		}
		int count = linksDao.update(req.toLinks());
		if (count == 0) {
			return result.error("修改失败");
		}
		return result.success();
	}

	@Override
	public ServiceResult<LinksResp> deleteById(LinksReq req) {

		return null;
	}

	@ReadDataSource
	@Override
	public ServiceResult<LinksResp> getById(LinksReq req) {
		ServiceResult<LinksResp> result = new ServiceResult<LinksResp>();
		if (req == null || req.getId() == null) {
			return result.error("查询条件不能为空");
		}
		Links Links = linksDao.getById(req.getId());
		if(Links == null || Links.getId() == null){
			return result.error("获取失败");
		}
		return result.success(new LinksResp(Links));
	}

	
}
