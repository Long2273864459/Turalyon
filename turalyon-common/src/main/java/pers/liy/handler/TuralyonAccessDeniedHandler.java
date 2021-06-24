package pers.liy.handler;

import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import pers.liy.entity.CloudResponse;
import pers.liy.utils.TuralyonUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Prock.Liy
 * @Date 2020/10/10 13:57
 * @Description  处理403类型异常
 **/
public class TuralyonAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException {
        CloudResponse cloudResponse = new CloudResponse();
        TuralyonUtil.makeResponse(
                response, MediaType.APPLICATION_JSON_VALUE,
                HttpServletResponse.SC_FORBIDDEN, cloudResponse.message("没有权限访问该资源"));
    }

}
