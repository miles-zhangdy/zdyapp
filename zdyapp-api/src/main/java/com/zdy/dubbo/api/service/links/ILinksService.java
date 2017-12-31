package com.zdy.dubbo.api.service.links;

import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.links.CreateLinksReq;
import com.zdy.dubbo.dto.links.LinksReq;
import com.zdy.dubbo.dto.links.LinksResp;
import com.zdy.dubbo.dto.links.ModifyLinksReq;

public interface ILinksService {
	
	ServiceResult<BaseList<LinksResp>> findLinksListByPageNo(LinksReq req);
	
	ServiceResult<LinksResp> save(CreateLinksReq req);
	
	ServiceResult<LinksResp> delete(LinksReq req);
	
	ServiceResult<LinksResp> update(ModifyLinksReq req);
	
	ServiceResult<LinksResp> deleteById(LinksReq req);
	
	ServiceResult<LinksResp> getById(LinksReq req);
	
}
