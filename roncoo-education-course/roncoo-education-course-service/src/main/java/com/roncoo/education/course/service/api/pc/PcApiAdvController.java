package com.roncoo.education.course.service.api.pc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.education.course.service.biz.pc.PcApiAdvBiz;
import com.roncoo.education.course.service.common.req.AdvDeleteREQ;
import com.roncoo.education.course.service.common.req.AdvPageREQ;
import com.roncoo.education.course.service.common.req.AdvSaveREQ;
import com.roncoo.education.course.service.common.req.AdvUpdateREQ;
import com.roncoo.education.course.service.common.req.AdvViewREQ;
import com.roncoo.education.course.service.common.resq.AdvPageRESQ;
import com.roncoo.education.course.service.common.resq.AdvViewRESQ;
import com.roncoo.education.util.base.BaseController;
import com.roncoo.education.util.base.Page;
import com.roncoo.education.util.base.Result;

import io.swagger.annotations.ApiOperation;

/**
 * 
 * 广告信息
 *
 */
@RestController
@RequestMapping(value = "/course/pc/adv")
public class PcApiAdvController extends BaseController {

	@Autowired
	private PcApiAdvBiz biz;

	/**
	 * 轮播广告分页列表接口
	 * 
	 * @param advPageREQ
	 * @return
	 */
	@ApiOperation(value = "轮播广告分页列表接口", notes = "轮播广告分页列表接口")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Result<Page<AdvPageRESQ>> list(@RequestBody AdvPageREQ advPageREQ) {
		return biz.list(advPageREQ);
	}

	/**
	 * 轮播广告添加接口
	 * 
	 * @param advSaveREQ
	 * @return
	 */
	@ApiOperation(value = "轮播广告添加接口", notes = "轮播广告添加接口")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Result<Integer> save(@RequestBody AdvSaveREQ advSaveREQ) {
		return biz.save(advSaveREQ);
	}

	/**
	 * 轮播广告更新接口
	 * 
	 * @param advUpdateREQ
	 * @return
	 */
	@ApiOperation(value = "轮播广告更新接口", notes = "轮播广告更新接口")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Result<Integer> update(@RequestBody AdvUpdateREQ advUpdateREQ) {
		return biz.update(advUpdateREQ);
	}

	/**
	 * 轮播广告删除接口
	 * 
	 * @param advDeleteREQ
	 * @return
	 */
	@ApiOperation(value = "轮播广告删除接口", notes = "轮播广告删除接口")
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public Result<Integer> delete(@RequestBody AdvDeleteREQ advDeleteREQ) {
		return biz.delete(advDeleteREQ);
	}

	/**
	 * 轮播广告查看接口
	 * 
	 * @param advViewREQ
	 * @return
	 */
	@ApiOperation(value = "轮播广告查看接口", notes = "轮播广告查看接口")
	@RequestMapping(value = "/view", method = RequestMethod.POST)
	public Result<AdvViewRESQ> view(@RequestBody AdvViewREQ advViewREQ) {
		return biz.view(advViewREQ);
	}

}
