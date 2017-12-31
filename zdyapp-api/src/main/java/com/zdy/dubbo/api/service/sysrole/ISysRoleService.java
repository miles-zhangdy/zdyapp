package com.zdy.dubbo.api.service.sysrole;

import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.sysrole.CreateSysRoleReq;
import com.zdy.dubbo.dto.sysrole.ModifySysRoleReq;
import com.zdy.dubbo.dto.sysrole.SysRoleReq;
import com.zdy.dubbo.dto.sysrole.SysRoleResp;

public interface ISysRoleService {
	
	ServiceResult<BaseList<SysRoleResp>> findSysRoleListByPageNo(SysRoleReq req);
	
	ServiceResult<SysRoleResp> save(CreateSysRoleReq req);
	
	ServiceResult<SysRoleResp> delete(SysRoleReq req);
	
	ServiceResult<SysRoleResp> update(ModifySysRoleReq req);
	
	ServiceResult<SysRoleResp> deleteById(SysRoleReq req);
	
	ServiceResult<SysRoleResp> getById(SysRoleReq req);
	
	ServiceResult<BaseList<SysRoleResp>> findSysRoleList(SysRoleReq req);
	
}
