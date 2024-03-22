package com.DoAn.ChatCoffee.service;

import com.DoAn.ChatCoffee.entity.Role;
import com.DoAn.ChatCoffee.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private IRoleRepository roleRepository;
    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }
    public Role getRoleById(Long id){
        Optional<Role> optional = roleRepository.findById(id);
        return optional.orElse(null);
    }

    public void addRole(Role role){
        roleRepository.save(role);
    }
    public void updateRole(Role role){
        roleRepository.save(role);
    }
    public void deleteRole(Long id){
        roleRepository.deleteById(id);
    }

}
