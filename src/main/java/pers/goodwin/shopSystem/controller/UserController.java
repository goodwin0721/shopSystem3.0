package pers.goodwin.shopSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.goodwin.shopSystem.pojo.User;
import pers.goodwin.shopSystem.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author goodwin
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    /**
     * 用户登录
     * @param username
     * @param password
     * @param request
     * @return
     */
    @RequestMapping("/m/login")
    public String login(String username, String password, HttpServletRequest request){
        User user = userService.login(username, password);
        if(user != null){
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            if(userService.isManager(user)) {
                session.setAttribute("isManager", true);
            }
            return "redirect:/p/index";
        }
        return "redirect:/p/login";
    }

    /**
     * 用户注册
     * @param username
     * @param password
     * @param birthdate
     * @param gender
     * @return
     */
    @RequestMapping("/m/register")
    public String register(String username,String password,String birthdate,String gender){
        boolean isSuccess = userService.register(username, password, birthdate, gender);
        if(isSuccess) {
            return "redirect:/p/index";
        }else {
            return "redirect:/p/register";
        }
    }

    /**
     * 用户退出登录
     * @param request
     * @return
     */
    @RequestMapping("/m/logout")
    public String logout(HttpServletRequest request){
//      request.getSession().removeAttribute("user");
//      request.getSession().removeAttribute("isManager");
        request.getSession().invalidate();
        return "redirect:/p/index";
    }

    /**
     * Ajax判断用户是否存在
     * @param username
     * @return
     */
    @RequestMapping(value = "/m/isExist",produces = "application/json")
    @ResponseBody
    public String isExist(@RequestParam("username") String username){
        if(userService.isExist(username)) {
            return "true";
        } else {
            return "false";
        }
    }
}
