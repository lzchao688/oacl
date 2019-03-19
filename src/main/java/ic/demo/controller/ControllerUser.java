package ic.demo.controller;

import ic.demo.service.ServiceUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ControllerUser {
    @Autowired
    private ServiceUser ac;
    @RequestMapping("/t1")
     public String queryall(Model model){
        model.addAttribute("person", ac.queryAll());
        System.out.println("65465");
        System.out.println("这是阿超写的");
        return "/list.html";

    }
}
