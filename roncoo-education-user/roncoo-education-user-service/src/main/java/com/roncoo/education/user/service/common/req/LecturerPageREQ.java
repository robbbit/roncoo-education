package com.roncoo.education.user.service.common.req;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 讲师信息分页列出
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class LecturerPageREQ implements Serializable {

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
	 * 状态(1:正常，0:禁用)
	 */
	@ApiModelProperty(value = "状态(1:正常，0:禁用)", required = false)
	private Integer statusId;
	/**
	 * 讲师名称
	 */
	@ApiModelProperty(value = "讲师名称", required = false)
	private String lecturerName;
	/**
	 * 讲师手机
	 */
	@ApiModelProperty(value = "讲师手机", required = false)
	private String lecturerMobile;

}
