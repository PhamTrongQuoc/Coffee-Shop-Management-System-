package com.DoAn.ChatCoffee.adminController;

import com.DoAn.ChatCoffee.entity.Thanhtoan;
import com.DoAn.ChatCoffee.entity.Vanchuyen;
import com.DoAn.ChatCoffee.service.QuanLyThanhToanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin/quan-ly-thanh-toan")
public class QuanLyThanhToan {
    @Autowired
    private QuanLyThanhToanService quanLyThanhToanService;
    @GetMapping()
    public String getAllThanhtoan(Model model) {
        model.addAttribute("listThanhToan", quanLyThanhToanService.getAllThanhToan());
        return "admin/quanlythanhtoan/index";
    }

    @GetMapping("/add")
    public String addNewForm(Model model) {
        model.addAttribute("thanhtoan", new Thanhtoan());
        return "admin/quanlythanhtoan/add";
    }

    @PostMapping("/add")
    public String addsubmit(@ModelAttribute("thanhtoan") Thanhtoan thanhtoan) {

        quanLyThanhToanService.save(thanhtoan);
        return "redirect:/admin/quan-ly-thanh-toan";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id ){
        quanLyThanhToanService.delete(id);
        return "redirect:/admin/quan-ly-thanh-toan";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model){
        model.addAttribute("thanhtoan", quanLyThanhToanService.getThanhToanById(id));
        return "admin/quanlythanhtoan/edit";
    }
    @PostMapping("/edit")
    public String editSubmit(@ModelAttribute("thanhtoan") Thanhtoan thanhtoan){
        quanLyThanhToanService.save(thanhtoan);
        return "redirect:/admin/quan-ly-thanh-toan";
    }
}
