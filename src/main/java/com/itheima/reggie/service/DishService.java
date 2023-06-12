package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;


/**
 * @Author:luosheng
 * @Date:2023/3/9 10:48
 * @Description:
 */

public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish、dish_flavor
    void saveWithFlavor(DishDto dishDto);
    //修改渲染页面，根据id查询菜品信息何对应的口味信息
    DishDto getByIdWithFlavor(Long id);
    //更新菜品信息，同时更新对应的口味信息
    void updateWithFlavor(DishDto dishDto);
}
