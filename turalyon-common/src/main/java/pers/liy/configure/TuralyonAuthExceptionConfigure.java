package pers.liy.configure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import pers.liy.handler.TuralyonAccessDeniedHandler;
import pers.liy.handler.TuralyonAuthExceptionEntryPoint;

/**
 * @Author Prock.Liy
 * @Date 2020/10/10 13:58
 * @Description  common模块是一个普通的maven项目，并不是一个Spring Boot项目，所以即使在这两个类上使用@Component注解标注，
 *               它们也不能被成功注册到各个微服务子系统的Spring IOC容器中。使用@Enable模块驱动的方式来解决这个问题
 **/
public class TuralyonAuthExceptionConfigure {

    /**
     * @ConditionalOnMissingBean注解的意思是，当IOC容器中没有指定名称或类型的Bean的时候，就注册它。
     * 以@ConditionalOnMissingBean(name = "accessDeniedHandler")为例，
     * 当微服务系统的Spring IOC容器中没有名称为accessDeniedHandler的Bean的时候，
     * 就将CloudAccessDeniedHandler注册为一个Bean。
     * 这样做的好处在于，子系统可以自定义自个儿的资源服务器异常处理器，覆盖我们在cloud-common通用模块里定义的
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(name = "accessDeniedHandler")
    public TuralyonAccessDeniedHandler accessDeniedHandler() {
        return new TuralyonAccessDeniedHandler();
    }

    @Bean
    @ConditionalOnMissingBean(name = "authenticationEntryPoint")
    public TuralyonAuthExceptionEntryPoint authenticationEntryPoint() {
        return new TuralyonAuthExceptionEntryPoint();
    }


}
