package com.zdy.links.ctrl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zdy.common.BaseController;
import com.zdy.common.Constant;
import com.zdy.common.model.SessionUser;
import com.zdy.dubbo.api.service.links.ILinksService;
import com.zdy.dubbo.common.exception.MyException;
import com.zdy.dubbo.common.util.BaseList;
import com.zdy.dubbo.common.util.Result;
import com.zdy.dubbo.common.util.ServiceResult;
import com.zdy.dubbo.dto.links.CreateLinksReq;
import com.zdy.dubbo.dto.links.LinksReq;
import com.zdy.dubbo.dto.links.LinksResp;
import com.zdy.dubbo.dto.links.ModifyLinksReq;
import com.zdy.links.vo.LinksVO;

@Controller
@RequestMapping("/links/*")
public class LinksController extends BaseController {
	
	@Resource
	private ILinksService linksService;

	@RequestMapping(value = "/tolinkspage")
	public ModelAndView toLinksPage() {
		ModelAndView mv = new ModelAndView("links/linksList");

		return mv;
	}
	
	@RequestMapping(value = "/findlinkslist")
	@ResponseBody
	public Result findLinksList(LinksVO vo) throws MyException {
		Result res = null;
		try {
			LinksReq d = new LinksReq(vo.toLinks());
			d.setBeginIndex((vo.getPage() - 1) * vo.getPageSize());
			d.setPage(vo.getPage());
			d.setPageSize(vo.getPageSize());
			ServiceResult<BaseList<LinksResp>> serviceResult = linksService.findLinksListByPageNo(d);
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
	
	@RequestMapping(value = "/addlinks")
	@ResponseBody
	public Result addLinks(LinksVO vo) throws MyException {
		Result res = null;
		try {
			HttpSession session = getSession();
			SessionUser sessionUser = (SessionUser) session.getAttribute(Constant.ENVIRONMENT_USER);
			vo.setCreateUser(sessionUser.getId());
			ServiceResult<LinksResp> serviceResult = linksService
					.save(new CreateLinksReq(vo.toLinks()));
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
	
	@RequestMapping(value = "/deletelinks")
	@ResponseBody
	public Result deleteLinks(String id) throws MyException {
		Result res = null;
		try {
			LinksReq req = new LinksReq();
			String[] array = id.split(",");
			Long[] a = new Long[array.length];
			int i = 0;
			for (String str : array) {
				a[i++] = Long.parseLong(str);
			}
			req.setIds(a);
			ServiceResult<LinksResp> serviceResult = linksService.delete(req);
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

	@RequestMapping(value = "/modifylinks")
	@ResponseBody
	public Result modifyLinks(LinksVO vo) throws MyException {
		Result res = null;
		try {
			HttpSession session = getSession();
			SessionUser sessionUser = (SessionUser) session.getAttribute(Constant.ENVIRONMENT_USER);
			vo.setOperUser(sessionUser.getId());
			ServiceResult<LinksResp> serviceResult = linksService.update(new ModifyLinksReq(vo.toLinks()));
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
	
	@RequestMapping(value = "/getlinks")
	@ResponseBody
	public Result getUser(Long id) throws MyException {
		Result res = null;
		try {
			LinksReq req = new LinksReq();
			req.setId(id);
			ServiceResult<LinksResp> serviceResult = linksService.getById(req);
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
