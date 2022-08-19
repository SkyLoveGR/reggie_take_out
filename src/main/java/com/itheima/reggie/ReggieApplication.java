package com.itheima.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Author: SKY
 * Createdate: 2022/8/17
 * Project_name: reggie_take_out
 * Description:
 */
@Slf4j    //日志
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@EnableCaching //开启缓存的注解功能
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class,args);
        log.info("项目启动成功...");
    }
}
