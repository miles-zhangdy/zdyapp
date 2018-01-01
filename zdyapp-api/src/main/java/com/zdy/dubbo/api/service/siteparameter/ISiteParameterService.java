package com.zdy.dubbo.api.service.siteparameter;

import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.siteparameter.CreateSiteParameterReq;
import com.zdy.dubbo.dto.siteparameter.SiteParameterReq;
import com.zdy.dubbo.dto.siteparameter.SiteParameterResp;
import com.zdy.dubbo.dto.siteparameter.ModifySiteParameterReq;

public interface ISiteParameterService {
	
	ServiceResult<BaseList<SiteParameterResp>> findSiteParameterListByPageNo(SiteParameterReq req);
	
	ServiceResult<SiteParameterResp> save(CreateSiteParameterReq req);
	
	ServiceResult<SiteParameterResp> delete(SiteParameterReq req);
	
	ServiceResult<SiteParameterResp> update(ModifySiteParameterReq req);
	
	ServiceResult<SiteParameterResp> deleteById(SiteParameterReq req);
	
	ServiceResult<SiteParameterResp> getById(SiteParameterReq req);
	
}
