package com.zdy.dubbo.dto.siteparameter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.zdy.dubbo.common.util.Page;
import com.zdy.dubbo.model.siteparameter.SiteParameter;


public class SiteParameterReq extends Page implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
    /**
     * id       db_column: id 
     */	
	private Long id;
    /**
     * paramName       db_column: PARAM_NAME 
     */	
	private String paramName;
    /**
     * paramValue       db_column: PARAM_VALUE 
     */	
	private String paramValue;
    /**
     * paramComment       db_column: PARAM_COMMENT 
     */	
	private String paramComment;
    /**
     * remark       db_column: REMARK 
     */	
	private String remark;
    /**
     * createTime       db_column: create_time 
     */	
	private Date createTime;
    /**
     * operTime       db_column: oper_time 
     */	
	private Date operTime;
    /**
     * createUser       db_column: create_user 
     */	
	private Long createUser;
    /**
     * rsrvStr1       db_column: RSRV_STR1 
     */	
	private String rsrvStr1;
    /**
     * rsrvStr2       db_column: RSRV_STR2 
     */	
	private String rsrvStr2;
    /**
     * rsrvStr3       db_column: RSRV_STR3 
     */	
	private String rsrvStr3;
    /**
     * rsrvStr4       db_column: RSRV_STR4 
     */	
	private String rsrvStr4;
    /**
     * rsrvStr5       db_column: RSRV_STR5 
     */	
	private String rsrvStr5;
    /**
     * rsrvStr6       db_column: RSRV_STR6 
     */	
	private String rsrvStr6;
	
	private Long[] ids;
	
	public void setIds(Long[] ids){
		this.ids = ids;
	}
	
	public Long[] getIds(){
		return this.ids;
	}
	
	public SiteParameterReq(){
		
	}
	
	public SiteParameterReq(SiteParameterReq siteParameterReq){
		if(null != siteParameterReq){
				this.setId(siteParameterReq.getId());
				this.setParamName(siteParameterReq.getParamName());
				this.setParamValue(siteParameterReq.getParamValue());
				this.setParamComment(siteParameterReq.getParamComment());
				this.setRemark(siteParameterReq.getRemark());
				this.setCreateTime(siteParameterReq.getCreateTime());
				this.setOperTime(siteParameterReq.getOperTime());
				this.setCreateUser(siteParameterReq.getCreateUser());
				this.setRsrvStr1(siteParameterReq.getRsrvStr1());
				this.setRsrvStr2(siteParameterReq.getRsrvStr2());
				this.setRsrvStr3(siteParameterReq.getRsrvStr3());
				this.setRsrvStr4(siteParameterReq.getRsrvStr4());
				this.setRsrvStr5(siteParameterReq.getRsrvStr5());
				this.setRsrvStr6(siteParameterReq.getRsrvStr6());
			this.setSortName(siteParameterReq.getSortName());
			this.setOrder(siteParameterReq.getOrder());
		}
	}
	
	public SiteParameterReq(SiteParameter siteParameter){
		if(null != siteParameter){
				this.id = siteParameter.getId();
				this.paramName = siteParameter.getParamName();
				this.paramValue = siteParameter.getParamValue();
				this.paramComment = siteParameter.getParamComment();
				this.remark = siteParameter.getRemark();
				this.createTime = siteParameter.getCreateTime();
				this.operTime = siteParameter.getOperTime();
				this.createUser = siteParameter.getCreateUser();
				this.rsrvStr1 = siteParameter.getRsrvStr1();
				this.rsrvStr2 = siteParameter.getRsrvStr2();
				this.rsrvStr3 = siteParameter.getRsrvStr3();
				this.rsrvStr4 = siteParameter.getRsrvStr4();
				this.rsrvStr5 = siteParameter.getRsrvStr5();
				this.rsrvStr6 = siteParameter.getRsrvStr6();
		}
	}
	
	public SiteParameter toSiteParameter(){
		SiteParameter  siteParameter = new SiteParameter();
		siteParameter.setId(this.id);
		siteParameter.setParamName(this.paramName);
		siteParameter.setParamValue(this.paramValue);
		siteParameter.setParamComment(this.paramComment);
		siteParameter.setRemark(this.remark);
		siteParameter.setCreateTime(this.createTime);
		siteParameter.setOperTime(this.operTime);
		siteParameter.setCreateUser(this.createUser);
		siteParameter.setRsrvStr1(this.rsrvStr1);
		siteParameter.setRsrvStr2(this.rsrvStr2);
		siteParameter.setRsrvStr3(this.rsrvStr3);
		siteParameter.setRsrvStr4(this.rsrvStr4);
		siteParameter.setRsrvStr5(this.rsrvStr5);
		siteParameter.setRsrvStr6(this.rsrvStr6);
		siteParameter.setIds(this.ids);
		siteParameter.setPage(this.getPage());
		siteParameter.setBeginIndex(this.getBeginIndex());
		siteParameter.setPageSize(this.getPageSize());
		return siteParameter;
	}
	
	public Map<String,Object> toMap(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("id",this.id);
		map.put("paramName",this.paramName);
		map.put("paramValue",this.paramValue);
		map.put("paramComment",this.paramComment);
		map.put("remark",this.remark);
		map.put("createTime",this.createTime);
		map.put("operTime",this.operTime);
		map.put("createUser",this.createUser);
		map.put("rsrvStr1",this.rsrvStr1);
		map.put("rsrvStr2",this.rsrvStr2);
		map.put("rsrvStr3",this.rsrvStr3);
		map.put("rsrvStr4",this.rsrvStr4);
		map.put("rsrvStr5",this.rsrvStr5);
		map.put("rsrvStr6",this.rsrvStr6);
		return map;
	}
	
		
	public void setId(Long value) {
		this.id = value;
	}
	
	public Long getId() {
		return this.id;
	}
	
		
	public void setParamName(String value) {
		this.paramName = value;
	}
	
	public String getParamName() {
		return this.paramName;
	}
	
		
	public void setParamValue(String value) {
		this.paramValue = value;
	}
	
	public String getParamValue() {
		return this.paramValue;
	}
	
		
	public void setParamComment(String value) {
		this.paramComment = value;
	}
	
	public String getParamComment() {
		return this.paramComment;
	}
	
		
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
		
	public void setCreateTime(Date value) {
		this.createTime = value;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	
		
	public void setOperTime(Date value) {
		this.operTime = value;
	}
	
	public Date getOperTime() {
		return this.operTime;
	}
	
		
	public void setCreateUser(Long value) {
		this.createUser = value;
	}
	
	public Long getCreateUser() {
		return this.createUser;
	}
	
		
	public void setRsrvStr1(String value) {
		this.rsrvStr1 = value;
	}
	
	public String getRsrvStr1() {
		return this.rsrvStr1;
	}
	
		
	public void setRsrvStr2(String value) {
		this.rsrvStr2 = value;
	}
	
	public String getRsrvStr2() {
		return this.rsrvStr2;
	}
	
		
	public void setRsrvStr3(String value) {
		this.rsrvStr3 = value;
	}
	
	public String getRsrvStr3() {
		return this.rsrvStr3;
	}
	
		
	public void setRsrvStr4(String value) {
		this.rsrvStr4 = value;
	}
	
	public String getRsrvStr4() {
		return this.rsrvStr4;
	}
	
		
	public void setRsrvStr5(String value) {
		this.rsrvStr5 = value;
	}
	
	public String getRsrvStr5() {
		return this.rsrvStr5;
	}
	
		
	public void setRsrvStr6(String value) {
		this.rsrvStr6 = value;
	}
	
	public String getRsrvStr6() {
		return this.rsrvStr6;
	}
	

 
	
 
}

