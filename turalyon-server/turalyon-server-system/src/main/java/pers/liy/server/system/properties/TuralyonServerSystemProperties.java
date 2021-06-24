package pers.liy.server.system.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author Prock.Liy
 * @Date 2020/10/12 22:27
 * @Description
 **/
@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:turalyon-server-system.properties"})
@ConfigurationProperties(prefix = "turalyon.server.system")
public class TuralyonServerSystemProperties {

    /**
     * 免认证 URI，多个值的话以逗号分隔
     */
    private String anonUrl;

    private TuralyonSwaggerProperties swagger = new TuralyonSwaggerProperties();
}
