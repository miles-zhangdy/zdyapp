package com.zdy.dubbo.api.service.user;

import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.user.CreateUserReq;
import com.zdy.dubbo.dto.user.ModifyUserReq;
import com.zdy.dubbo.dto.user.UserReq;
import com.zdy.dubbo.dto.user.UserResp;

public interface IUserService {
	
	ServiceResult<BaseList<UserResp>> findUserListByPageNo(UserReq req);
	
	ServiceResult<UserResp> save(CreateUserReq req);
	
	ServiceResult<UserResp> delete(UserReq req);
	
	ServiceResult<UserResp> update(ModifyUserReq req);
	
	ServiceResult<UserResp> deleteById(UserReq req);
	
	ServiceResult<UserResp> getById(UserReq req);
	
	ServiceResult<UserResp> login(UserReq req);
	
	ServiceResult<UserResp> fetch(UserReq req);
}
