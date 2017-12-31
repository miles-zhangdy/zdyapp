package com.zdy.dubbo.api.service.dictionary;

import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.dictionary.CreateDictionaryParamReq;
import com.zdy.dubbo.dto.dictionary.DictionaryParamReq;
import com.zdy.dubbo.dto.dictionary.DictionaryParamResp;
import com.zdy.dubbo.dto.dictionary.ModifyDictionaryParamReq;

public interface IDictionaryParamService {
	
	ServiceResult<BaseList<DictionaryParamResp>> findDictionaryParamListByPageNo(DictionaryParamReq req);
	
	ServiceResult<DictionaryParamResp> save(CreateDictionaryParamReq req);
	
	ServiceResult<DictionaryParamResp> delete(DictionaryParamReq req);
	
	ServiceResult<DictionaryParamResp> update(ModifyDictionaryParamReq req);
	
	ServiceResult<DictionaryParamResp> deleteById(DictionaryParamReq req);
	
	ServiceResult<DictionaryParamResp> getById(DictionaryParamReq req);
	
}
