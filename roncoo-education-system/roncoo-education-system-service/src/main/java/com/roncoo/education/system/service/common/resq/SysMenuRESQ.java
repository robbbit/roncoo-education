package com.roncoo.education.system.service.common.resq;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 菜单信息
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class SysMenuRESQ implements Serializable {

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
	 * 父ID
	 */
	@ApiModelProperty(value = "父ID")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long parentId;
	/**
	 * 菜单名称
	 */
	@ApiModelProperty(value = "菜单名称")
	private String menuName;

	/**
	 * 菜单名称(Tree 树形控件规范)
	 */
	@ApiModelProperty(value = "菜单名称")
	private String label;
	/**
	 * 菜单路径
	 */
	@ApiModelProperty(value = "菜单路径")
	private String menuUrl;
	/**
	 * 菜单图标
	 */
	@ApiModelProperty(value = "菜单图标")
	private String menuIcon;
	/**
	 * 接口URL
	 */
	@ApiModelProperty(value = "接口URL")
	private String apiUrl;
	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remark;
	/**
	 * 是否显示(1: 显示；0:不显示)
	 */
	@ApiModelProperty(value = "是否显示(1: 显示；0:不显示)")
	private Integer hiddenType;
	/**
	 * 菜单类型(1：目录 2：菜单 3：按钮)
	 */
	@ApiModelProperty(value = "菜单类型(1：目录   2：菜单   3：按钮)")
	private Integer menuType;
	/**
	 * 下级菜单集合
	 */
	private List<SysMenuRESQ> children;
}
