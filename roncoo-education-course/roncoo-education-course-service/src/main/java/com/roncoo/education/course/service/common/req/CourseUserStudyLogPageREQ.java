package com.roncoo.education.course.service.common.req;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 课程用户学习日志-分页列出
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class CourseUserStudyLogPageREQ implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 当前页
	 */
	@ApiModelProperty(value = "当前页", required = true)
	private int pageCurrent = 1;
	/**
	 * 每页记录数
	 */
	@ApiModelProperty(value = "每页记录数", required = true)
	private int pageSize = 20;
	/**
	 * 用户编号
	 */
	@ApiModelProperty(value = " 用户编号", required = true)
	private Long userExtNo;
	/**
	 * 开始时间
	 */
	@ApiModelProperty(value = "开始时间", required = false)
	private String beginGmtCreate;
	/**
	 * 结束时间
	 */
	@ApiModelProperty(value = "结束时间", required = false)
	private String endGmtCreate;

}
