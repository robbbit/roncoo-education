package com.roncoo.education.system.service.common.resq;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 角色用户关联表
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class SysRoleUserListRESQ implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 角色用户关联集合
	 */
	@ApiModelProperty(value = "角色用户关联集合")
	private List<SysRoleUserRESQ> list = new ArrayList<>();
}
