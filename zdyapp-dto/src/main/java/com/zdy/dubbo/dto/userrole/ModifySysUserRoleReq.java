package com.zdy.dubbo.dto.userrole;

import java.io.Serializable;

import com.zdy.dubbo.model.userrole.SysUserRole;


public class ModifySysUserRoleReq  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long sysUserId;
	private Long sysRoleId;
	private Long custId;
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setSysUserId(Long sysUserId) {
		this.sysUserId = sysUserId;
	}
	
	public Long getSysUserId() {
		return this.sysUserId;
	}
	public void setSysRoleId(Long sysRoleId) {
		this.sysRoleId = sysRoleId;
	}
	
	public Long getSysRoleId() {
		return this.sysRoleId;
	}

	public ModifySysUserRoleReq(){
		
	}
	
	public ModifySysUserRoleReq(SysUserRole sysUserRole){
		if(sysUserRole != null){
			this.setId(sysUserRole.getId());
			this.setSysUserId(sysUserRole.getSysUserId());
			this.setSysRoleId(sysUserRole.getSysRoleId());
			this.setCustId(sysUserRole.getCustId());
		}
	}
	public SysUserRole toSysUserRole(){
		SysUserRole  sysUserRole = new SysUserRole();
		sysUserRole.setId(this.id);
		sysUserRole.setSysUserId(this.sysUserId);
		sysUserRole.setSysRoleId(this.sysRoleId);
		sysUserRole.setCustId(this.custId);
		return sysUserRole;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
	
}
