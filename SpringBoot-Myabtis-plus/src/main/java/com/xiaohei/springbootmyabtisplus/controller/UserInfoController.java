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

}
