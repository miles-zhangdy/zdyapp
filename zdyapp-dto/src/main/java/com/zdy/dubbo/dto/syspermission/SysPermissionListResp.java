package com.zdy.dubbo.dto.syspermission;

import java.io.Serializable;
import java.util.Date;

public class SysPermissionListResp  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SysPermissionResp[] list;
	
	public SysPermissionResp[] getList(){
		return list;
	}
	
	public void setList(SysPermissionResp[] list){
		this.list = list;
	}
}

