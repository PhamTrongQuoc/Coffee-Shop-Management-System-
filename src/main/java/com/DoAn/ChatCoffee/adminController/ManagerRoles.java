package com.DoAn.ChatCoffee.adminController;

import com.DoAn.ChatCoffee.entity.Role;
import com.DoAn.ChatCoffee.entity.Sanpham;
import com.DoAn.ChatCoffee.service.RoleService;
import com.DoAn.ChatCoffee.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/managerRoles")
public class ManagerRoles {

    @Autowired
    private RoleService roleService;
    @GetMapping
    public String index(Model model){
        model.addAttribute("roles", roleService.getAllRoles());
        return "admin/managerRoles/index";
    }
    @GetMapping("/add")
    public  String addRoleForm(Model model){
        model.addAttribute("role", new Role());
        return "admin/managerRoles/add";
    }
    @PostMapping("/add")
    public String addBook( @ModelAttribute("role") Role role){
        roleService.updateRole(role);
        return  "redirect:/admin/managerRoles";

    }
    @GetMapping("/edit/{id}")
    public String editRoleForm(@PathVariable Long id, Model model){
        model.addAttribute("role",roleService.getRoleById(id));
        return "admin/managerRoles/edit";
    }

    @PostMapping("/edit")
    public String editRole(@ModelAttribute("edit") Role role) {
        roleService.updateRole(role);
        return "redirect:/admin/managerRoles";
    }

    @GetMapping("/delete/{id}")
    public String deleteRoleForm(@PathVariable Long id,Model model){
        roleService.deleteRole(id);
        return "redirect:/admin/managerRoles";
    }
}
