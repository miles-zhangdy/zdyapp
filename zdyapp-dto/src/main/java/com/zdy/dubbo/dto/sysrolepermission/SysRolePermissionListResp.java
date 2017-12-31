package com.zdy.dubbo.dto.sysrolepermission;

import java.io.Serializable;

public class SysRolePermissionListResp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SysRolePermissionResp[] list;
	
	public SysRolePermissionResp[] getList(){
		return list;
	}
	
	public void setList(SysRolePermissionResp[] list){
		this.list = list;
	}
}

