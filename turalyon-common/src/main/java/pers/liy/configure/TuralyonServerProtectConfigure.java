package pers.liy.configure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pers.liy.interceptor.TuralyonServerProtectInterceptor;

/**
 * @Author Prock.Liy
 * @Date 2020/10/10 16:12
 * @Description
 **/
public class TuralyonServerProtectConfigure implements WebMvcConfigurer {

    /**
     * 当IOC容器里没有PasswordEncoder类型的Bean的时候，则将BCryptPasswordEncoder注册到IOC容器中
     * @return PasswordEncoder
     */
    @Bean
    @ConditionalOnMissingBean(value = PasswordEncoder.class)
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public HandlerInterceptor turalyonServerProtectInterceptor() {
        return new TuralyonServerProtectInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(turalyonServerProtectInterceptor());
    }
}
