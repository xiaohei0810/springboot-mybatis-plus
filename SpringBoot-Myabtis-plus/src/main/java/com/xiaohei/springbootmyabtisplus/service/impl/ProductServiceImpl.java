package com.xiaohei.springbootmyabtisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaohei.springbootmyabtisplus.entity.Product;
import com.xiaohei.springbootmyabtisplus.entity.ResponseData;
import com.xiaohei.springbootmyabtisplus.entity.UserInfo;
import com.xiaohei.springbootmyabtisplus.mapper.ProductMapper;
import com.xiaohei.springbootmyabtisplus.mapper.UserInfoMapper;
import com.xiaohei.springbootmyabtisplus.service.ProductService;
import com.xiaohei.springbootmyabtisplus.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/11/12 2:27 下午
 * @Version 1.0
 * @Describtion
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    // 设置事物的传播属性为默认值，
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int insertProduct(Product product,int num) {

        // 正常插入
        productMapper.insert(new Product().builder().name("产品2").price(2L).build());

        if (num == 1){
            //报错
            productMapper.insert(product);
        }

        return 1;

    }
}
