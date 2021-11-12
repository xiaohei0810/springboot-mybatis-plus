package com.xiaohei.springbootmyabtisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaohei.springbootmyabtisplus.entity.Product;
import com.xiaohei.springbootmyabtisplus.entity.UserInfo;
import org.springframework.stereotype.Component;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/11/12 2:26 下午
 * @Version 1.0
 * @Describtion
 */
//@Mapper
@Component
public interface ProductMapper extends BaseMapper<Product> {
}
