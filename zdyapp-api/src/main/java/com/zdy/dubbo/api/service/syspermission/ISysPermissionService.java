package com.zdy.dubbo.api.service.syspermission;

import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.syspermission.CreateSysPermissionReq;
import com.zdy.dubbo.dto.syspermission.ModifySysPermissionReq;
import com.zdy.dubbo.dto.syspermission.SysPermissionReq;
import com.zdy.dubbo.dto.syspermission.SysPermissionResp;

public interface ISysPermissionService {
	
	ServiceResult<BaseList<SysPermissionResp>> findSysPermissionListByPageNo(SysPermissionReq req);
	
	ServiceResult<SysPermissionResp> save(CreateSysPermissionReq req);
	
	ServiceResult<SysPermissionResp> delete(SysPermissionReq req);
	
	ServiceResult<SysPermissionResp> update(ModifySysPermissionReq req);
	
	ServiceResult<SysPermissionResp> deleteById(SysPermissionReq req);
	
	ServiceResult<SysPermissionResp> getById(SysPermissionReq req);
	
	ServiceResult<BaseList<SysPermissionResp>> findSysPermissionList(SysPermissionReq req);
	
	ServiceResult<BaseList<SysPermissionResp>> findUserSysPermissionList(SysPermissionReq req);
	
	ServiceResult<BaseList<SysPermissionResp>> findSysPermissionMenuList(SysPermissionReq req);
	
}
