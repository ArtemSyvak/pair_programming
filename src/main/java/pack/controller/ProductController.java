package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pack.entity.Product;
import pack.service.ProductService;
import pack.service.UserService;

/**
 * Created by Artem on 10.07.2017.
 */

@Controller
public class ProductController {

    @Autowired
    ProductService productService;
    @Autowired
    UserService userService;

    @RequestMapping("addProduct")
    public String addProduct(Model model){
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    @PostMapping("createProduct")
    public  String toListUser(@ModelAttribute(value = "product") Product product){
        productService.save(product);
        return "redirect:/";
    }

}
