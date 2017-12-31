package com.zdy.biz.sysuserrole.dao;

import com.zdy.dubbo.common.util.ISuperDao;
import com.zdy.dubbo.model.userrole.SysUserRole;
public interface ISysUserRoleDao  extends ISuperDao<SysUserRole> {
	
	int batchSaving(SysUserRole s);
	
	int deleteByUserId(Long sysUserId);
	
}
