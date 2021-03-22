package pers.goodwin.shopSystem.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 管理员页面访问拦截器
 */
public class AdminInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getRequestURI());
        HttpSession session = request.getSession();
        boolean isManager = (boolean) session.getAttribute("isManager");
        //如果是管理员，放行
        if(isManager)
            return true;
        //不是管理员，重定向回首页
        response.sendRedirect("/welcome.jsp");
        return false;
    }
}
