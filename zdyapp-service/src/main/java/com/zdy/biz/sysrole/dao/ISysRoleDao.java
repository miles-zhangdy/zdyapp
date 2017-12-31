package com.zdy.biz.sysrole.dao;

import java.util.List;

import com.zdy.dubbo.common.util.ISuperDao;
import com.zdy.dubbo.model.sysrole.SysRole;

public interface ISysRoleDao extends ISuperDao<SysRole> {
	
	List<SysRole> findUserRoleList(SysRole t);
	
}
