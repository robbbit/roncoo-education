package com.roncoo.education.system.service.common.req;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 菜单角色关联表-列出
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class SysMenuRoleListREQ implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 角色ID
	 */
	@ApiModelProperty(value = "角色ID", required = true)
	private Long roleId;
}
