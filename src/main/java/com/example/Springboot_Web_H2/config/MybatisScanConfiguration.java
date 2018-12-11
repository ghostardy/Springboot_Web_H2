package com.example.Springboot_Web_H2.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.Springboot_Web_H2.mapper")
public class MybatisScanConfiguration {
}
