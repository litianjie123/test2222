package com.example.demo.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("operator_log")
public class OperatorLog {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("parameter_type")
    private String parameterType;

    @TableField("opr_name")
    private String oprName;

    @TableField("opr_type")
    private String oprType;

    @TableField("before_change")
    private String beforeChange;

    @TableField("after_change")
    private String afterChange;

    @TableField("parameter_change")
    private String parameterChange;

    @TableField("create_time")
    private String createTime;
}