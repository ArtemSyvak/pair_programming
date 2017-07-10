package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import pack.editor.ProductEditor;
import pack.entity.Product;
import pack.entity.User;
import pack.service.UserService;

/**
 * Created by Artem on 09.07.2017.
 */


@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @Autowired
    ProductEditor productEditor;


    @RequestMapping("/")
    public String mainPage(Model model){
        model.addAttribute("user" , new User());
        return "index";
    }


    @GetMapping ("login")
    public String login(){
        return "login";
    }


    @PostMapping("addUserWithProduct")
    public String addUserWithProduct(@ModelAttribute(value = "user") User user){
        userService.save(user);

        return "redirect:/";
    }

    @InitBinder
    public void bind(WebDataBinder dataBinder){
        dataBinder.registerCustomEditor(Product.class, productEditor);
    }





}
