package com.zdy.dubbo.dto.links;

import java.io.Serializable;
import java.util.Date;

import com.zdy.dubbo.model.links.Links;

public class CreateLinksReq implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String linkName;
	
	private String linkAddr;
	
	private Integer display;
	
	private Integer linkType;
	
	private String linkComment;
	
	private Long createUser;
	
	private Date createTime;
	
	private Date operTime;
	
	private Long operUser;
	
	private String rsrvStr1;
	
	private String rsrvStr2;
	
	private String rsrvStr4;
	
	private String rsrvStr3;
	
	private String rsrvStr5;
	
	private String rsrvStr6;
	
	private String rsrvStr7;
	
	private String rsrvStr8;
	
	private String rsrvStr9;
	
	private String rsrvStr0;
	
	private String attachId;
	
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	
	public String getLinkName() {
		return this.linkName;
	}
	public void setLinkAddr(String linkAddr) {
		this.linkAddr = linkAddr;
	}
	
	public String getLinkAddr() {
		return this.linkAddr;
	}
	public void setDisplay(Integer display) {
		this.display = display;
	}
	
	public Integer getDisplay() {
		return this.display;
	}
	public void setLinkType(Integer linkType) {
		this.linkType = linkType;
	}
	
	public Integer getLinkType() {
		return this.linkType;
	}
	public void setLinkComment(String linkComment) {
		this.linkComment = linkComment;
	}
	
	public String getLinkComment() {
		return this.linkComment;
	}
	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}
	
	public Long getCreateUser() {
		return this.createUser;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}
	
	public Date getOperTime() {
		return this.operTime;
	}
	public void setOperUser(Long operUser) {
		this.operUser = operUser;
	}
	
	public Long getOperUser() {
		return this.operUser;
	}
	public void setRsrvStr1(String rsrvStr1) {
		this.rsrvStr1 = rsrvStr1;
	}
	
	public String getRsrvStr1() {
		return this.rsrvStr1;
	}
	public void setRsrvStr2(String rsrvStr2) {
		this.rsrvStr2 = rsrvStr2;
	}
	
	public String getRsrvStr2() {
		return this.rsrvStr2;
	}
	public void setRsrvStr4(String rsrvStr4) {
		this.rsrvStr4 = rsrvStr4;
	}
	
	public String getRsrvStr4() {
		return this.rsrvStr4;
	}
	public void setRsrvStr3(String rsrvStr3) {
		this.rsrvStr3 = rsrvStr3;
	}
	
	public String getRsrvStr3() {
		return this.rsrvStr3;
	}
	public void setRsrvStr5(String rsrvStr5) {
		this.rsrvStr5 = rsrvStr5;
	}
	
	public String getRsrvStr5() {
		return this.rsrvStr5;
	}
	public void setRsrvStr6(String rsrvStr6) {
		this.rsrvStr6 = rsrvStr6;
	}
	
	public String getRsrvStr6() {
		return this.rsrvStr6;
	}
	public void setRsrvStr7(String rsrvStr7) {
		this.rsrvStr7 = rsrvStr7;
	}
	
	public String getRsrvStr7() {
		return this.rsrvStr7;
	}
	public void setRsrvStr8(String rsrvStr8) {
		this.rsrvStr8 = rsrvStr8;
	}
	
	public String getRsrvStr8() {
		return this.rsrvStr8;
	}
	public void setRsrvStr9(String rsrvStr9) {
		this.rsrvStr9 = rsrvStr9;
	}
	
	public String getRsrvStr9() {
		return this.rsrvStr9;
	}
	public void setRsrvStr0(String rsrvStr0) {
		this.rsrvStr0 = rsrvStr0;
	}
	
	public String getRsrvStr0() {
		return this.rsrvStr0;
	}
	public void setAttachId(String attachId) {
		this.attachId = attachId;
	}
	
	public String getAttachId() {
		return this.attachId;
	}
	
	public CreateLinksReq(){
		
	}
	
	public CreateLinksReq(Links links){
		if(links != null){
				this.setLinkName(links.getLinkName());
				this.setLinkAddr(links.getLinkAddr());
				this.setDisplay(links.getDisplay());
				this.setLinkType(links.getLinkType());
				this.setLinkComment(links.getLinkComment());
				this.setCreateUser(links.getCreateUser());
				this.setCreateTime(links.getCreateTime());
				this.setOperTime(links.getOperTime());
				this.setOperUser(links.getOperUser());
				this.setRsrvStr1(links.getRsrvStr1());
				this.setRsrvStr2(links.getRsrvStr2());
				this.setRsrvStr4(links.getRsrvStr4());
				this.setRsrvStr3(links.getRsrvStr3());
				this.setRsrvStr5(links.getRsrvStr5());
				this.setRsrvStr6(links.getRsrvStr6());
				this.setRsrvStr7(links.getRsrvStr7());
				this.setRsrvStr8(links.getRsrvStr8());
				this.setRsrvStr9(links.getRsrvStr9());
				this.setRsrvStr0(links.getRsrvStr0());
				this.setAttachId(links.getAttachId());
		}
	}
	public Links toLinks(){
		Links  links = new Links();
		links.setLinkName(this.linkName);
		links.setLinkAddr(this.linkAddr);
		links.setDisplay(this.display);
		links.setLinkType(this.linkType);
		links.setLinkComment(this.linkComment);
		links.setCreateUser(this.createUser);
		links.setCreateTime(this.createTime);
		links.setOperTime(this.operTime);
		links.setOperUser(this.operUser);
		links.setRsrvStr1(this.rsrvStr1);
		links.setRsrvStr2(this.rsrvStr2);
		links.setRsrvStr4(this.rsrvStr4);
		links.setRsrvStr3(this.rsrvStr3);
		links.setRsrvStr5(this.rsrvStr5);
		links.setRsrvStr6(this.rsrvStr6);
		links.setRsrvStr7(this.rsrvStr7);
		links.setRsrvStr8(this.rsrvStr8);
		links.setRsrvStr9(this.rsrvStr9);
		links.setRsrvStr0(this.rsrvStr0);
		links.setAttachId(this.attachId);
		return links;
	}
}
