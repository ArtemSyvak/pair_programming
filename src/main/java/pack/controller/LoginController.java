package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pack.entity.User;
import pack.service.UserService;

/**
 * Created by Artem on 09.07.2017.
 */


@Controller
public class LoginController {

    @Autowired
    UserService userService;


    @RequestMapping("/")
    public String mainPage(Model model){
        model.addAttribute("user" , new User());
        return "index";
    }


    @GetMapping ("login")
    public String login(){
        return "login";
    }


    @PostMapping("loginAction")
    public String addUser(@ModelAttribute(value = "user") User user){
        userService.save(user);
        return "redirect:/";
    }





}
