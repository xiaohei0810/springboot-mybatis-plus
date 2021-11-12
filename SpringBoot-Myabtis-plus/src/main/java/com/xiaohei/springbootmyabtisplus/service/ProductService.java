package com.xiaohei.springbootmyabtisplus.service;

import com.xiaohei.springbootmyabtisplus.entity.Product;
import com.xiaohei.springbootmyabtisplus.entity.ResponseData;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/11/12 2:27 下午
 * @Version 1.0
 * @Describtion
 */
public interface ProductService {

    int insertProduct(Product product,int num);

}
