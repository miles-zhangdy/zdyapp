package com.zdy.siteparameter.ctrl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zdy.common.BaseController;
import com.zdy.common.Constant;
import com.zdy.common.model.SessionUser;
import com.zdy.dubbo.api.service.siteparameter.ISiteParameterService;
import com.zdy.dubbo.common.exception.MyException;
import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.Result;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.siteparameter.CreateSiteParameterReq;
import com.zdy.dubbo.dto.siteparameter.SiteParameterReq;
import com.zdy.dubbo.dto.siteparameter.SiteParameterResp;
import com.zdy.dubbo.dto.siteparameter.ModifySiteParameterReq;
import com.zdy.siteparameter.vo.SiteParameterVO;

@Controller
@RequestMapping("/siteparameter/*")
public class SiteParameterController extends BaseController {
	
	@Resource
	private ISiteParameterService siteparameterService;

	@RequestMapping(value = "/tositeparameterpage")
	public ModelAndView toSiteParameterPage() {
		ModelAndView mv = new ModelAndView("siteparameter/parameterList");

		return mv;
	}
	
	@RequestMapping(value = "/findsiteparameterlist")
	@ResponseBody
	public Result findSiteParameterList(SiteParameterVO vo) throws MyException {
		Result res = null;
		try {
			SiteParameterReq d = new SiteParameterReq(vo.toSiteParameter());
			d.setBeginIndex((vo.getPage() - 1) * vo.getPageSize());
			d.setPage(vo.getPage());
			d.setPageSize(vo.getPageSize());
			ServiceResult<BaseList<SiteParameterResp>> serviceResult = siteparameterService.findSiteParameterListByPageNo(d);
			if (serviceResult.isSuccess()) {
				res = new Result(true, serviceResult.getBusinessObject());
			} else {
				return new Result(false, "获取数据错误");
			}
		} catch (Exception e) {
			throw new MyException("获取列表错误", e);
		}
		return res;
	}
	
	@RequestMapping(value = "/addsiteparameter")
	@ResponseBody
	public Result addSiteParameter(SiteParameterVO vo) throws MyException {
		Result res = null;
		try {
			HttpSession session = getSession();
			SessionUser sessionUser = (SessionUser) session.getAttribute(Constant.ENVIRONMENT_USER);
			vo.setCreateUser(sessionUser.getId());
			ServiceResult<SiteParameterResp> serviceResult = siteparameterService
					.save(new CreateSiteParameterReq(vo.toSiteParameter()));
			if (serviceResult != null && serviceResult.isSuccess()) {
				res = new Result(true, serviceResult.getMsg());
			} else {
				res = new Result(false, "添加失败");
			}
		} catch (Exception e) {
			throw new MyException("添加信息异常", e);
		}
		return res;
	}
	
	@RequestMapping(value = "/deletesiteparameter")
	@ResponseBody
	public Result deleteSiteParameter(String id) throws MyException {
		Result res = null;
		try {
			SiteParameterReq req = new SiteParameterReq();
			String[] array = id.split(",");
			Long[] a = new Long[array.length];
			int i = 0;
			for (String str : array) {
				a[i++] = Long.parseLong(str);
			}
			req.setIds(a);
			ServiceResult<SiteParameterResp> serviceResult = siteparameterService.delete(req);
			if (serviceResult.isSuccess()) {
				res = new Result(true, serviceResult.getMsg());
			} else {
				return new Result(false, serviceResult.getMsg());
			}
		} catch (Exception e) {
			throw new MyException("删除数据异常", e);
		}
		return res;
	}

	@RequestMapping(value = "/modifysiteparameter")
	@ResponseBody
	public Result modifySiteParameter(SiteParameterVO vo) throws MyException {
		Result res = null;
		try {
			ServiceResult<SiteParameterResp> serviceResult = siteparameterService.update(new ModifySiteParameterReq(vo.toSiteParameter()));
			if (serviceResult.isSuccess()) {
				res = new Result(true, serviceResult.getMsg());
			} else {
				return new Result(false, serviceResult.getMsg());
			}
		} catch (Exception e) {
			throw new MyException("修改数据异常", e);
		}
		return res;
	}
	
	@RequestMapping(value = "/getsiteparameter")
	@ResponseBody
	public Result getUser(Long id) throws MyException {
		Result res = null;
		try {
			SiteParameterReq req = new SiteParameterReq();
			req.setId(id);
			ServiceResult<SiteParameterResp> serviceResult = siteparameterService.getById(req);
			if (serviceResult.isSuccess()) {
				res = new Result(true, serviceResult.getBusinessObject());
			} else {
				return new Result(false, serviceResult.getMsg());
			}
		} catch (Exception e) {
			throw new MyException("获取数据异常", e);
		}
		return res;
	}
		
}
