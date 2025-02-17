package com.roncoo.education.system.service.common.resq;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 后台用户信息-查看
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class SysUserViewRESQ implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long id;
	/**
	 * 状态(1:正常，0:禁用)
	 */
	@ApiModelProperty(value = "状态(1:正常，0:禁用)")
	private Integer statusId;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer sort;
	/**
	 * 用户编号
	 */
	@ApiModelProperty(value = "用户编号")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long userNo;
	/**
	 * 手机
	 */
	@ApiModelProperty(value = "手机")
	private String mobile;
	/**
	 * 真实姓名
	 */
	@ApiModelProperty(value = "真实姓名")
	private String realName;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remark;
}
