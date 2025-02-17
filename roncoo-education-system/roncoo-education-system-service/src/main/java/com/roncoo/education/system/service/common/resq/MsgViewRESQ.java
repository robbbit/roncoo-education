package com.roncoo.education.system.service.common.resq;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 站内信息表
 *
 */
@Data
@Accessors(chain = true)
public class MsgViewRESQ implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键id")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long id;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer sort;
	/**
	 * 短信标题
	 */
	@ApiModelProperty(value = "短信标题")
	private String msgTitle;
	/**
	 * 短信内容
	 */
	@ApiModelProperty(value = "短信内容")
	private String msgText;
	/**
	 * 是否已发送(1是;0否)
	 */
	@ApiModelProperty(value = "是否已发送(1是;0否)")
	private Integer isSend;
	/**
	 * 是否定时发送（1是，0否）
	 */
	@ApiModelProperty(value = "是否定时发送(1是;0否)")
	private Integer isTimeSend;

	/**
	 * 是否置顶(1是;0否)
	 */
	@ApiModelProperty(value = "是否置顶(1是;0否)")
	private Integer isTop;
	/**
	 * 发送时间
	 */
	@ApiModelProperty(value = "发送时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date sendTime;
}
