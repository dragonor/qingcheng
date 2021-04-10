package com.qingcheng.service.goods;

import com.qingcheng.pojo.goods.Brand;

import java.util.List;

/*
 * 品牌实体类的Service层接口：调用Dao层的实现类
 * @date:  2021/4/11
 */
public interface BrandService {

    /*
     * 查询所有品牌信息
     * @param
     * @return List<Brand>
     * @date:  2021/4/11
     */
    List<Brand> findAll();
}
