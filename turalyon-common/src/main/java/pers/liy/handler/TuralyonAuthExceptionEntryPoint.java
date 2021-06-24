package pers.liy.handler;

import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import pers.liy.entity.CloudResponse;
import pers.liy.utils.TuralyonUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Prock.Liy
 * @Date 2020/10/10 13:53
 * @Description 处理资源服务器异常，令牌不正确返回401和用户无权限返回403
 **/
public class TuralyonAuthExceptionEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        CloudResponse cloudResponse = new CloudResponse();
        TuralyonUtil.makeResponse(
                response,MediaType.APPLICATION_JSON_VALUE,
                HttpServletResponse.SC_UNAUTHORIZED, cloudResponse.message("token无效")
        );
    }

}
