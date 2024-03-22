package com.DoAn.ChatCoffee.service;

import com.DoAn.ChatCoffee.entity.Sanpham;
import com.DoAn.ChatCoffee.entity.Vanchuyen;
import com.DoAn.ChatCoffee.repository.IGioHangRepository;
import com.DoAn.ChatCoffee.repository.IQuanLyVanChuyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuanLyVanChuyenService {
    @Autowired
    private IQuanLyVanChuyenRepository quanLyVanChuyenRepository;
    //Thêm - sửa
    public void save(Vanchuyen vanchuyen){
        quanLyVanChuyenRepository.save(vanchuyen);
    }

    //xóa
    public void delete(Long id){
        quanLyVanChuyenRepository.deleteById(id);
    }

    //Lấy dah nh sách
    public List<Vanchuyen> getAllVanChuyen(){
        return quanLyVanChuyenRepository.findAll();
    }

    //Lấy 1 vận chuyển
    public Vanchuyen getVanChuyenById(Long id){
        Optional<Vanchuyen> optionalVanchuyen = quanLyVanChuyenRepository.findById(id);
        if(optionalVanchuyen.isPresent()){
            return optionalVanchuyen.get();
        }
        else {
            throw new RuntimeException("Không tìm thấy phương thức vận chuyển này!");
        }
    }

}
