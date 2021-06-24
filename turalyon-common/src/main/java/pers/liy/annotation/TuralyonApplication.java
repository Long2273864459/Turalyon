package pers.liy.annotation;

import org.springframework.context.annotation.Import;
import pers.liy.selector.TuralyonApplicationSelector;

import java.lang.annotation.*;

/**
 * @Author Prock.Liy
 * @Date 2020/10/10 16:33
 * @Description 将CloudApplicationSelector注册到IOC容器中
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(TuralyonApplicationSelector.class)
public @interface TuralyonApplication {
}
