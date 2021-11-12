package com.xiaohei.springbootmyabtisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author liangyusheng@xiaomi.com
 * @Date 2021/11/12 4:43 下午
 * @Version 1.0
 * @Describtion
 */
@TableName(value = "product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @TableId
    private Long id;

    private String name;

    private Long price;

}
