package com.qingcheng.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qingcheng.dao.BrandMapper;
import com.qingcheng.pojo.goods.Brand;
import com.qingcheng.service.goods.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description 品牌Service层的实现类
 * @Author Dragon
 * @Date 2021/4/11
 * @Version 1.0.0
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }
}
