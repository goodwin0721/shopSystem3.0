package pers.goodwin.shopSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.goodwin.shopSystem.pojo.CartVo;
import pers.goodwin.shopSystem.pojo.Goods;
import pers.goodwin.shopSystem.pojo.IndentVo;
import pers.goodwin.shopSystem.pojo.User;
import pers.goodwin.shopSystem.service.GoodsService;
import pers.goodwin.shopSystem.service.ShoppingService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author goodwin
 * 跳转页面
 */
@Controller
public class PageController {

    @Autowired
    @Qualifier("goodsService")
    private GoodsService goodsService;

    @Autowired
    @Qualifier("shoppingService")
    ShoppingService shoppingService;

    /**
     * 跳转主页
     * @param model
     * @return
     */
    @RequestMapping("/p/index")
    public String index(Model model){
        List<Goods> list = goodsService.getHotSale();
        model.addAttribute("hotSale",list);
        return "index";
    }

    /**
     * 跳转购物车页面
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/p/cart")
    public String cart(Model model, HttpServletRequest request){
        HttpSession session =  request.getSession();
        //判断用户是否登录
        User user = (User) session.getAttribute("user");
        if(user == null) {
            return "login";
        }
        int userId = user.getId();
        List<CartVo> cartList = new ArrayList<CartVo>();
        cartList = shoppingService.showUserCart(userId);
        //总计
        int total = 0;
        if (!cartList.isEmpty()){
            model.addAttribute("cartList", cartList);
            for(CartVo cart : cartList) {
                total += cart.getAubtotal();
            }
        }
        model.addAttribute("total", total);
        return "cart";
    }

    /**
     * 跳转我的订单页面
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/p/indent")
    public String indent(Model model, HttpServletRequest request){
        HttpSession session =  request.getSession();
        User user = (User) session.getAttribute("user");
        if(user == null) {
            return "login";
        }
        int userId = user.getId();
        List<IndentVo> indentList = shoppingService.showUserIndent(userId);
        if (indentList != null) {
            model.addAttribute("indentList", indentList);
        }
        return "indent";
    }

    /**
     * 跳转商品分类页面
     * @return
     */
    @RequestMapping("/p/classify")
    public String classify(){
        return "classify";
    }

    /**
     * 跳转个人中心页面
     * @param request
     * @return
     */
    @RequestMapping("/p/center")
    public String center(HttpServletRequest request){
        HttpSession session =  request.getSession();
        User user = (User) session.getAttribute("user");
        if(user == null) {
            return "login";
        }
        return "center";
    }

    /**
     * 跳转服务页面
     * @return
     */
    @RequestMapping("/p/service")
    public String service(){
        return "service";
    }

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/p/login")
    public String login(){
        return "login";
    }

    /**
     * 跳转注册页面
     * @return
     */
    @RequestMapping("/p/register")
    public String register(){
        return "register";
    }

    /**
     * 跳转管理员页面
     * @param request
     * @return
     */
    @RequestMapping("/admin/manager")
    public String manager(HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        if( user == null) {
            return "index";
        }
        boolean isManager = (boolean) request.getSession().getAttribute("isManager");
        if(isManager) {
            List<Goods> goodsList = goodsService.getAll();
            request.setAttribute("goodsList", goodsList);
            return "manager";
        }
        return "redirect:/p/index";
    }

    /**
     * 跳转管理员增加商品页面
     * @param request
     * @return
     */
    @RequestMapping("/admin/addGoods")
    public String addGoods(HttpServletRequest request){
        if((boolean) request.getSession().getAttribute("isManager")) {
            List<Goods> goodsList = goodsService.getAll();
            request.setAttribute("goodsList", goodsList);
            return "addGoods";
        }
        return "redirect:/p/index";
    }
}
