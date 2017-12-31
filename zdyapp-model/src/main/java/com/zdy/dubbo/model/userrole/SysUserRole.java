package com.zdy.dubbo.model.userrole;

import java.util.HashMap;
import java.util.Map;

import com.zdy.dubbo.common.util.Page;


public class SysUserRole extends Page implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
    /**
     * id       db_column: id 
     */	
	private Long id;
    /**
     * sysUserId       db_column: sys_user_id 
     */	
	private Long sysUserId;
    /**
     * sysRoleId       db_column: sys_role_id 
     */	
	private Long sysRoleId;
	
	private Long[] sysRoleIds;
	
	private Long custId;

	public SysUserRole(){
	}

	public SysUserRole(Long id){
		this.id = id;
	}


	public SysUserRole(SysUserRole sysUserRole){
		if(null != sysUserRole){
				this.setId(sysUserRole.getId());
				this.setSysUserId(sysUserRole.getSysUserId());
				this.setSysRoleId(sysUserRole.getSysRoleId());
				this.setCustId(sysUserRole.getCustId());
		}
	}
	

		
	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
		
	public void setSysUserId(Long value) {
		this.sysUserId = value;
	}
	
	public Long getSysUserId() {
		return this.sysUserId;
	}
		
	public void setSysRoleId(Long value) {
		this.sysRoleId = value;
	}
	
	public Long getSysRoleId() {
		return this.sysRoleId;
	}

	public Long[] getSysRoleIds() {
		return sysRoleIds;
	}

	public void setSysRoleIds(Long[] sysRoleIds) {
		this.sysRoleIds = sysRoleIds;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
 
}

