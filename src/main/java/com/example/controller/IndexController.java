package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.User;

@Controller
public class IndexController {
    /**
     * @Description 用处：copyright  插入固定信息
     * @author作者：mp
     * @date   2019年5月31日
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    /**
     * @Description 用处： css ,js 的引用
     * @author作者：mp
     * @date   2019年5月31日
     * @return
     */
    @RequestMapping("/fragment")
    public String fragment() {
        return "fragment";
    }

    /**
     * @Description 用处：layout 公用的模板
     * @author作者：mp
     * @date   2019年5月31日
     * @return
     */
    @RequestMapping("/layout")
    public String layout() {
        return "layout";
    }

    /**
     * @Description 用处： 替换的页面主体信息
     * @author作者：mp
     * @date   2019年5月31日
     * @return
     */
    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    
    /**
     * @Description 用处：把后台数据传入前台
     * @author作者：mp
     * @date   2019年5月31日
     * @param map
     * @return
     */
    @RequestMapping("/string")
    public String string(ModelMap map) {
        map.addAttribute("userName", "ityouknow");
        map.addAttribute("flag", "yes");
        map.addAttribute("users", getUserList());
        map.addAttribute("sex", "woman");
        map.addAttribute("name", "neo");
        map.addAttribute("age", 30);
        map.addAttribute("type", "link");
        map.addAttribute("pageId", "springcloud/2017/09/11/");
        map.addAttribute("img", "http://www.ityouknow.com/assets/images/neo.jpg");
        return "string";
    }

    private List<User> getUserList(){
        List<User> list=new ArrayList<User>();
        User user1=new User("大牛",12,"123456");
        User user2=new User("小牛",6,"123563");
        User user3=new User("纯洁的微笑",66,"666666");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return  list;
    }

}