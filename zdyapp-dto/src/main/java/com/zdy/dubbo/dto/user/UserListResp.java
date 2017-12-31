package com.zdy.dubbo.dto.user;

import java.io.Serializable;

public class UserListResp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserResp[] list;
	
	public UserResp[] getList(){
		return list;
	}
	
	public void setList(UserResp[] list){
		this.list = list;
	}
}

