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
@TableName("user")
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("opr_id")
    private String oprId;

    @TableField("opr_name")
    private String oprName;

    @TableField("role")
    private String role;

    @TableField("password")
    private String password;

    @TableField("vehicle_type")
    private String vehicleType;

    @TableField("vehicle_number")
    private String vehicleNumber;

    @TableField("vehicle_exist")
    private Integer vehicleExist;

    @TableField("create_opr_name")
    private String createOprName;

    @TableField("create_time")
    private String createTime;
}