package com.DoAn.ChatCoffee.adminController;

import com.DoAn.ChatCoffee.entity.Sanpham;
import com.DoAn.ChatCoffee.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/managerProducts")
public class ManagerProducts {
    @Autowired
    private SanPhamService sanPhamService;
    @GetMapping
    public String index(Model model){
        model.addAttribute("listProducts", sanPhamService.getAllProduct());
        return "admin/managerProducts/index";
    }

    @GetMapping("/add")
    public  String addBookForm(Model model){
        model.addAttribute("product", new Sanpham());
        return "admin/managerProducts/add";
    }
    @PostMapping("/add")
    public String addBook( @ModelAttribute("product") Sanpham product){
        sanPhamService.saveProduct(product);
        return  "redirect:/admin/managerProducts";

    }

    @GetMapping("/listProduct")
    public String listProduct(){
        return "admin/managerProducts/listProduct";
    }

    @GetMapping("/addProduct")
    public String addProduct(){
        return "admin/managerProducts/addProduct";
    }

    @GetMapping("/editProduct")
    public String editProduct(){
        return "admin/managerProducts/editProduct";
    }

    @GetMapping("/deleteProduct")
    public String deleteProduct(){
        return "admin/managerProducts/deleteProduct";
    }
}
