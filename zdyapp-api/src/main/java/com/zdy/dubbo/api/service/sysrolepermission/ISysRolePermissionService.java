package com.zdy.dubbo.api.service.sysrolepermission;

import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.sysrolepermission.CreateSysRolePermissionReq;
import com.zdy.dubbo.dto.sysrolepermission.ModifySysRolePermissionReq;
import com.zdy.dubbo.dto.sysrolepermission.SysRolePermissionReq;
import com.zdy.dubbo.dto.sysrolepermission.SysRolePermissionResp;

public interface ISysRolePermissionService {
	
	ServiceResult<BaseList<SysRolePermissionResp>> findSysRolePermissionListByPageNo(SysRolePermissionReq req);
	
	ServiceResult<SysRolePermissionResp> save(CreateSysRolePermissionReq req);
	
	ServiceResult<SysRolePermissionResp> delete(SysRolePermissionReq req);
	
	ServiceResult<SysRolePermissionResp> update(ModifySysRolePermissionReq req);
	
	ServiceResult<SysRolePermissionResp> deleteById(SysRolePermissionReq req);
	
	ServiceResult<SysRolePermissionResp> getById(SysRolePermissionReq req);
	
}
