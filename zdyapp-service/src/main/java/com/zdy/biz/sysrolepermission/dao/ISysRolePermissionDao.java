package com.zdy.biz.sysrolepermission.dao;

import com.zdy.dubbo.common.util.ISuperDao;
import com.zdy.dubbo.model.sysrolepermission.SysRolePermission;
public interface ISysRolePermissionDao  extends ISuperDao<SysRolePermission> {
	
	int batchSaving(SysRolePermission s);
	
	int deleteByRoleId(Long sysRoleId);
	
}
