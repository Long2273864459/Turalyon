package pers.liy.annotation;

import org.springframework.context.annotation.Import;
import pers.liy.configure.TuralyonAuthExceptionConfigure;

import java.lang.annotation.*;

/**
 * @Author Prock.Liy
 * @Date 2020/10/10 14:01
 * @Description @Import将CloudAuthExceptionConfigure配置类引入了进来。
 *
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(TuralyonAuthExceptionConfigure.class)
public @interface EnableCloudAuthExceptionHandler {
}
