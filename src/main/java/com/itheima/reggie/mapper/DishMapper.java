package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: SKY
 * Createdate: 2022/8/17
 * Project_name: reggie_take_out
 * Description:
 */
@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
