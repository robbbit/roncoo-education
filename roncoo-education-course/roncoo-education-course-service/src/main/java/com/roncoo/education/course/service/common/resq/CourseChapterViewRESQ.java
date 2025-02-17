package com.roncoo.education.course.service.common.resq;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 章节信息-查看
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class CourseChapterViewRESQ implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "章节ID")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long id;
	/**
	 * 课程ID
	 */
	@ApiModelProperty(value = "课程ID")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long courseId;
	/**
	 * 章节名称
	 */
	@ApiModelProperty(value = "章节名称")
	private String chapterName;
	/**
	 * 课时集合
	 */
	@ApiModelProperty(value = "课时集合")
	private List<CourseChapterPeriodViewRESQ> courseChapterPeriodList = new ArrayList<>();;
}
