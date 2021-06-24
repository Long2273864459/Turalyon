package pers.liy.server.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import pers.liy.annotation.TuralyonApplication;

/**
 * @Author Prock.Liy
 * @Date 2020/10/10 12:15
 * @Description 启动类
 * @EnableGlobalMethodSecurity(prePostEnabled = true)注解，表示开启Spring Cloud Security权限注
 **/
@EnableFeignClients
@SpringBootApplication
@TuralyonApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class TuralyonServerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuralyonServerTestApplication.class, args);
    }

}
