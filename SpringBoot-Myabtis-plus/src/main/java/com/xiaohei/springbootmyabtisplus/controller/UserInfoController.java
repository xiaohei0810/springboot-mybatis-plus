package com.xiaohei.springbootmyabtisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.xiaohei.springbootmyabtisplus.entity.ResponseData;
import com.xiaohei.springbootmyabtisplus.entity.UserInfo;
import com.xiaohei.springbootmyabtisplus.mapper.UserInfoMapper;
import com.xiaohei.springbootmyabtisplus.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/11/12 2:29 下午
 * @Version 1.0
 * @Describtion
 */
@RestController
@RequestMapping("/xiaohei")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/queryAll")
    @ResponseBody
    public ResponseData queryAllInfo(){
        ResponseData result = userInfoService.queryAllInfo();
        return result;
    }

    /**
     * Transaction事物属性测试一:默认属性:Propagation.REQUIRED。
     * description 事物方法insertProduct()被另一个事物transactionA()调用，事务方法insertProduct()在事务方法transactionA()内运行，即两个方法在同一个事务中，两个事务
     * 在同一个事务中，发生异常一起回滚，所以当insertProduct()方法抛出异常，两个方法事务都进行回滚。
     * @return
     */
    @GetMapping("/transactionTest")
    @ResponseBody
    public ResponseData transactionTest(){
        ResponseData result = userInfoService.transactionA();
        return result;
    }

}
