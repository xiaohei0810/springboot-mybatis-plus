package com.xiaohei.springbootmyabtisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaohei.springbootmyabtisplus.entity.Product;
import com.xiaohei.springbootmyabtisplus.entity.ResponseData;
import com.xiaohei.springbootmyabtisplus.entity.UserInfo;
import com.xiaohei.springbootmyabtisplus.mapper.UserInfoMapper;
import com.xiaohei.springbootmyabtisplus.service.ProductService;
import com.xiaohei.springbootmyabtisplus.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/11/12 2:27 下午
 * @Version 1.0
 * @Describtion
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private ProductService productService;

    @Override
    public ResponseData queryAllInfo() {
        ResponseData data = new ResponseData();

        List<UserInfo> userInfo = userInfoMapper.selectList(new QueryWrapper<UserInfo>());
        data.setResp(userInfo);
        data.setSuccess(Boolean.TRUE);
        return data;
    }


    @Override
    // @Transactional的默认属性即事物传播行为为-REQUIRED，默认值，如果有事务在运行，当前的方法就在这个事务内运行，否则，就启动一个新的事务，并在自己的事务内运行。
    @Transactional
    public ResponseData transactionA() {
        ResponseData data = new ResponseData();

        for (int i = 0; i < 2; i++) {
            // 调用事物B
            productService.insertProduct(new Product().builder().id(1L).name("产品1").price(1L).build(),i);
        }

        return data;
    }


}
