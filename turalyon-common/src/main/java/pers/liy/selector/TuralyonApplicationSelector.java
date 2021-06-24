package pers.liy.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import pers.liy.configure.TuralyonAuthExceptionConfigure;
import pers.liy.configure.TuralyonOAuth2FeignConfigure;
import pers.liy.configure.TuralyonServerProtectConfigure;

/**
 * @Author Prock.Liy
 * @Date 2020/10/10 16:28
 * @Description 一次加载自定义注解
 **/
public class TuralyonApplicationSelector implements ImportSelector {

    /**
     * 通过selectImports方法，我们一次性导入了TuralyonAuthExceptionConfigure、TuralyonServerProtectConfigure
     * @param annotationMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{
                TuralyonAuthExceptionConfigure.class.getName(),
                TuralyonOAuth2FeignConfigure.class.getName(),
                TuralyonServerProtectConfigure.class.getName()
        };
    }

}
