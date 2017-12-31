package com.zdy.dubbo.api.service.dictionary;

import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.dictionary.CreateDictionaryReq;
import com.zdy.dubbo.dto.dictionary.DictionaryReq;
import com.zdy.dubbo.dto.dictionary.DictionaryResp;
import com.zdy.dubbo.dto.dictionary.ModifyDictionaryReq;

public interface IDictionaryService {
	
	public ServiceResult<BaseList<DictionaryResp>> findDictionaryListByPageNo(DictionaryReq req);
	
	public ServiceResult<DictionaryResp> save(CreateDictionaryReq req);
	
	public ServiceResult<DictionaryResp> delete(DictionaryReq req);
	
	public ServiceResult<DictionaryResp> update(ModifyDictionaryReq req);
	
	public ServiceResult<DictionaryResp> deleteById(DictionaryReq req);
	
	public ServiceResult<DictionaryResp> getById(DictionaryReq req);
	
}
