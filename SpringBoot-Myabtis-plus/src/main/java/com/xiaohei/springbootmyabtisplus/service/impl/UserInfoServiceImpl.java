package com.xiaohei.springbootmyabtisplus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaohei.springbootmyabtisplus.entity.ResponseData;
import com.xiaohei.springbootmyabtisplus.entity.UserInfo;
import com.xiaohei.springbootmyabtisplus.mapper.UserInfoMapper;
import com.xiaohei.springbootmyabtisplus.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Override
    public ResponseData queryAllInfo() {
        ResponseData data = new ResponseData();

        List<UserInfo> userInfo = userInfoMapper.selectList(new QueryWrapper<UserInfo>());
        data.setResp(userInfo);
        data.setSuccess(Boolean.TRUE);
        return data;
    }
}
