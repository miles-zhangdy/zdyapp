package com.zdy.dubbo.dto.sysrole;

import java.io.Serializable;
import java.util.Date;

public class SysRoleListResp  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SysRoleResp[] list;
	
	public SysRoleResp[] getList(){
		return list;
	}
	
	public void setList(SysRoleResp[] list){
		this.list = list;
	}
}

