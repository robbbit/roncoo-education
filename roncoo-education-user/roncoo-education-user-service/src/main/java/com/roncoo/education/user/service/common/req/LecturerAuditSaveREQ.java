package com.roncoo.education.user.service.common.req;

import java.io.Serializable;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 讲师信息-审核添加
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class LecturerAuditSaveREQ implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 讲师用户编号
	 */
	@ApiModelProperty(value = "讲师用户编号", required = false)
	private Long lecturerUserNo;
	/**
	 * 讲师名称
	 */
	@ApiModelProperty(value = "讲师名称", required = false)
	private String lecturerName;
	/**
	 * 讲师手机
	 */
	@ApiModelProperty(value = "讲师手机", required = true)
	private String lecturerMobile;
	/**
	 * 讲师邮箱
	 */
	@ApiModelProperty(value = "讲师邮箱", required = false)
	private String lecturerEmail;
	/**
	 * 职位
	 */
	@ApiModelProperty(value = "职位", required = false)
	private String position;
	/**
	 * 头像
	 */
	@ApiModelProperty(value = "头像", required = false)
	private String headImgUrl;
	/**
	 * 简介
	 */
	@ApiModelProperty(value = "简介", required = false)
	private String introduce;
	/**
	 * 讲师分成比例
	 */
	@ApiModelProperty(value = "讲师分成比例", required = false)
	private BigDecimal lecturerProportion;
	/**
	 * 用戶登陆密码（如果用户不存在）
	 */
	@ApiModelProperty(value = "用戶登陆密码（如果用户不存在）", required = false)
	private String mobilePsw;
	/**
	 * 用戶确认密码（如果用户不存在）
	 */
	@ApiModelProperty(value = "用戶确认密码（如果用户不存在）", required = false)
	private String confirmPasswd;

}
