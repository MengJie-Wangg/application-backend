package com.ruoyi.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 角色和菜单关联表
 * </p>
 *
 * @author author
 * @since 2024-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_role_menu")
@ApiModel(value="SysRoleMenu对象", description="角色和菜单关联表")
public class SysRoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色ID")
    @TableId(value = "role_id", type = IdType.AUTO)
    private Long roleId;

    @ApiModelProperty(value = "菜单ID")
    private Long menuId;


}
