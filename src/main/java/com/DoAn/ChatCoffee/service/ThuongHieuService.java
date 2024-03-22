package com.DoAn.ChatCoffee.service;

import com.DoAn.ChatCoffee.entity.Thuonghieu;
import com.DoAn.ChatCoffee.repository.IThuongHieuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThuongHieuService {
    @Autowired
    private IThuongHieuRepository thuongHieuRepository;

    public List<Thuonghieu> getAllThuongHieu(){
        return thuongHieuRepository.findAll();
    }

    public Thuonghieu getThuongHieuById(Long id){
        Optional<Thuonghieu> optional = thuongHieuRepository.findById(id);
        return optional.orElse(null);
    }

    public void deleteThuongHieu(Long id){
        thuongHieuRepository.deleteById(id);
    }

    public void saveThuongHieu(Thuonghieu thuonghieu){
        thuongHieuRepository.save(thuonghieu);
    }
}
