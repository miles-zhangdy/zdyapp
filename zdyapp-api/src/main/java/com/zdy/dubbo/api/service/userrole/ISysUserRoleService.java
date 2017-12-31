package com.zdy.dubbo.api.service.userrole;

import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.userrole.CreateSysUserRoleReq;
import com.zdy.dubbo.dto.userrole.ModifySysUserRoleReq;
import com.zdy.dubbo.dto.userrole.SysUserRoleReq;
import com.zdy.dubbo.dto.userrole.SysUserRoleResp;

public interface ISysUserRoleService {
	
	ServiceResult<BaseList<SysUserRoleResp>> findSysUserRoleListByPageNo(SysUserRoleReq req);
	
	ServiceResult<SysUserRoleResp> save(CreateSysUserRoleReq req);
	
	ServiceResult<SysUserRoleResp> delete(SysUserRoleReq req);
	
	ServiceResult<SysUserRoleResp> update(ModifySysUserRoleReq req);
	
	ServiceResult<SysUserRoleResp> deleteById(SysUserRoleReq req);
	
	ServiceResult<SysUserRoleResp> getById(SysUserRoleReq req);
	
	ServiceResult<BaseList<SysUserRoleResp>> findSysUserRoleList(SysUserRoleReq req);
	
}
