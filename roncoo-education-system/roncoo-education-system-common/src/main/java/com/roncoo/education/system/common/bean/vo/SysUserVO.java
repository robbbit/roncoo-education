package com.roncoo.education.system.common.bean.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 后台用户信息
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class SysUserVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
    /**
     * 状态(1:正常，0:禁用)
     */
    private Integer statusId;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 用户编号
     */
    private Long userNo;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 备注
     */
    private String remark;

}
