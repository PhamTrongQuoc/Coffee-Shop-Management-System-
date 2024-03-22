package com.DoAn.ChatCoffee.adminController;

import com.DoAn.ChatCoffee.entity.Sanpham;
import com.DoAn.ChatCoffee.entity.Vanchuyen;
import com.DoAn.ChatCoffee.service.QuanLyVanChuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin/quan-ly-van-chuyen")
public class QuanLyVanChuyen {
    @Autowired
    private QuanLyVanChuyenService quanLyVanChuyenService;

    @GetMapping()
    public String getAllVanChuyen(Model model) {
        model.addAttribute("listvc", quanLyVanChuyenService.getAllVanChuyen());
        return "admin/quanlyvanchuyen/index";
    }

    @GetMapping("/add")
    public String addNewForm(Model model) {
        model.addAttribute("vanchuyen", new Vanchuyen());
        return "admin/quanlyvanchuyen/add";
    }

    @PostMapping("/add")
    public String addsubmit(@ModelAttribute("vanchuyen") Vanchuyen vanchuyen) {
        vanchuyen.setGia((Long) vanchuyen.getGia());
        quanLyVanChuyenService.save(vanchuyen);
        return "redirect:/admin/quan-ly-van-chuyen";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id ){
        quanLyVanChuyenService.delete(id);
        return "redirect:/admin/quan-ly-van-chuyen";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model){
        model.addAttribute("vanchuyen", quanLyVanChuyenService.getVanChuyenById(id));
        return "admin/quanlyvanchuyen/edit";
    }
    @PostMapping("/edit")
    public String editSubmit(@ModelAttribute("vanchuyen") Vanchuyen vanchuyen){
        quanLyVanChuyenService.save(vanchuyen);
        return "redirect:/admin/quan-ly-van-chuyen";
    }
}
