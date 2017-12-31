package com.zdy.dubbo.dto.sysrole;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.zdy.dubbo.common.util.Page;
import com.zdy.dubbo.model.sysrole.SysRole;


public class SysRoleReq extends Page implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
    /**
     * id       db_column: id 
     */	
	private Long id;
    /**
     * name       db_column: name 
     */	
	private String name;
    /**
     * 是否可用,1：可用，0不可用       db_column: available 
     */	
	private String available;
	
	private Long userId;
	
	private Long custId;
	
	private Long[] ids;
	
	public void setIds(Long[] ids){
		this.ids = ids;
	}
	
	public Long[] getIds(){
		return this.ids;
	}
	
	public SysRoleReq(){
		
	}
	
	public SysRoleReq(SysRoleReq sysRoleReq){
		if(null != sysRoleReq){
				this.setId(sysRoleReq.getId());
				this.setName(sysRoleReq.getName());
				this.setAvailable(sysRoleReq.getAvailable());
				this.setCustId(sysRoleReq.getCustId());
		}
	}
	
	public SysRoleReq(SysRole sysRole){
		if(null != sysRole){
				this.id = sysRole.getId();
				this.name = sysRole.getName();
				this.available = sysRole.getAvailable();
				this.custId = sysRole.getCustId();
		}
	}
	
	public SysRole toSysRole(){
		SysRole  sysRole = new SysRole();
		sysRole.setId(this.id);
		sysRole.setName(this.name);
		sysRole.setAvailable(this.available);
		sysRole.setIds(this.ids);
		sysRole.setUserId(this.userId);
		sysRole.setCustId(this.custId);
		sysRole.setPage(this.getPage());
		sysRole.setBeginIndex(this.getBeginIndex());
		sysRole.setPageSize(this.getPageSize());
		return sysRole;
	}
		
	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	
		
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	
		
	public void setAvailable(String value) {
		this.available = value;
	}
	
	public String getAvailable() {
		return this.available;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
	

 
	
 
}

