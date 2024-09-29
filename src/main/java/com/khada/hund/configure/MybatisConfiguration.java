package com.khada.hund.configure;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.khada.hund", annotationClass = Mapper.class)
public class MybatisConfiguration {
}
