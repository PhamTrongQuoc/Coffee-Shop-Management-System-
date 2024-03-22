package com.DoAn.ChatCoffee.adminController;

import com.DoAn.ChatCoffee.entity.Loaisanpham;
import com.DoAn.ChatCoffee.service.LoaiSanPhamService;
import com.DoAn.ChatCoffee.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/admin/managerCategories")
public class ManagerCategories {
    @Autowired
    private SanPhamService sanPhamService;
    @Autowired
    private LoaiSanPhamService loaiSanPhamService;

    @GetMapping()
    public String index(Model model){
        List<Loaisanpham> Loais = loaiSanPhamService.getAllCategories();
        model.addAttribute("Loais",Loais);


        return "admin/managerCategory/index";
    }

    @GetMapping("/addCategory")
    public String addCategory(Model model){

        model.addAttribute("loai",new Loaisanpham());
//        model.addAttribute("categories", loaiSanPhamService.getAllCategories() );
        return "admin/managerCategory/addCategory";
    }
    @PostMapping("/addCategory")
    public String addLoai(@ModelAttribute("loai") Loaisanpham loaisanpham){
        loaiSanPhamService.addLoaiSP(loaisanpham);
        return "redirect:/admin/managerCategories";
    }
    @GetMapping("/edit/{id}")
    public  String editBookForm(@PathVariable Long id, Model model){
        model.addAttribute("loai",loaiSanPhamService.getloaiSanphamByid(id));
//        model.addAttribute("categories", loaiSanPhamService.getAllCategories() );
        return "admin/managerCategory/edit";

    }
    @PostMapping("/edit{id}")
    public String editBook(@ModelAttribute("loai") Loaisanpham loai){
        loaiSanPhamService.saveLoaiSP(loai);
        return "redirect:/admin/managerCategories";

    }
    @GetMapping("/deleteCategory/{id}")
    public String deleteLoaiSP(@PathVariable("id") Long id){
        Loaisanpham book = loaiSanPhamService.getloaiSanphamByid(id);
        loaiSanPhamService.deleteLoaiSP(id);

        return "redirect:/admin/managerCategories";

    }

//    @GetMapping("/deleteCategory")
//    public String deleteCategory(){
//        return "admin/managerCategory/deleteCategory";
//    }
}
