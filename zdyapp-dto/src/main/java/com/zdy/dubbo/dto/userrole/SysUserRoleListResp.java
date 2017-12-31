package com.zdy.dubbo.dto.userrole;

import java.io.Serializable;
import java.util.Date;

public class SysUserRoleListResp  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SysUserRoleResp[] list;
	
	public SysUserRoleResp[] getList(){
		return list;
	}
	
	public void setList(SysUserRoleResp[] list){
		this.list = list;
	}
}

