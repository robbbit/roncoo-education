package com.roncoo.education.course.service.api.pc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.education.course.service.biz.pc.PcApiCourseRecommendBiz;
import com.roncoo.education.course.service.common.req.CourseRecommendDeleteREQ;
import com.roncoo.education.course.service.common.req.CourseRecommendPageREQ;
import com.roncoo.education.course.service.common.req.CourseRecommendSaveREQ;
import com.roncoo.education.course.service.common.req.CourseRecommendUpdateREQ;
import com.roncoo.education.course.service.common.req.CourseRecommendViewREQ;
import com.roncoo.education.course.service.common.resq.CourseRecommendPageRESQ;
import com.roncoo.education.course.service.common.resq.CourseRecommendViewRESQ;
import com.roncoo.education.util.base.BaseController;
import com.roncoo.education.util.base.Page;
import com.roncoo.education.util.base.Result;

import io.swagger.annotations.ApiOperation;

/**
 * 课程推荐
 *
 */
@RestController
@RequestMapping(value = "/course/pc/course/recommend")
public class PcApiCourseRecommendController extends BaseController {

	@Autowired
	private PcApiCourseRecommendBiz biz;

	/**
	 * 分页列出课程推荐信息
	 * 
	 * @param courseRecommendPageREQ
	 * @return
	 */
	@ApiOperation(value = "分页列出课程推荐信息", notes = "分页列出课程推荐信息")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Result<Page<CourseRecommendPageRESQ>> listForPage(@RequestBody CourseRecommendPageREQ courseRecommendPageREQ) {
		return biz.listForPage(courseRecommendPageREQ);
	}

	/**
	 * 添加课程推荐信息
	 * 
	 * @param courseRecommendSaveREQ
	 * @return
	 */
	@ApiOperation(value = "添加课程推荐信息", notes = "添加课程推荐信息")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Result<Integer> save(@RequestBody CourseRecommendSaveREQ courseRecommendSaveREQ) {
		return biz.save(courseRecommendSaveREQ);
	}

	/**
	 * 删除课程推荐信息
	 * 
	 * @param courseRecommendDeleteREQ
	 * @return
	 */
	@ApiOperation(value = "删除课程推荐信息", notes = "删除课程推荐信息")
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public Result<Integer> delete(@RequestBody CourseRecommendDeleteREQ courseRecommendDeleteREQ) {
		return biz.delete(courseRecommendDeleteREQ);
	}

	/**
	 * 更新课程推荐信息
	 * 
	 * @param courseRecommendUpdateREQ
	 * @return
	 */
	@ApiOperation(value = "更新课程推荐信息", notes = "更新课程推荐信息")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Result<Integer> update(@RequestBody CourseRecommendUpdateREQ courseRecommendUpdateREQ) {
		return biz.update(courseRecommendUpdateREQ);
	}

	/**
	 * 查看课程推荐信息
	 * 
	 * @param courseCategoryViewREQ
	 * @return
	 */
	@ApiOperation(value = "查看课程推荐信息", notes = "查看课程推荐信息")
	@RequestMapping(value = "/view", method = RequestMethod.POST)
	public Result<CourseRecommendViewRESQ> view(@RequestBody CourseRecommendViewREQ courseRecommendViewREQ) {
		return biz.view(courseRecommendViewREQ);
	}

}
