package com.zdy.dubbo.dto.links;

import java.io.Serializable;

public class LinksListResp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private LinksResp[] list;
	
	public LinksResp[] getList(){
		return list;
	}
	
	public void setList(LinksResp[] list){
		this.list = list;
	}
}

