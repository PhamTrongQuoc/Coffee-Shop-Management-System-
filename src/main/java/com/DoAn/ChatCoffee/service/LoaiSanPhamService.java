package com.DoAn.ChatCoffee.service;

import com.DoAn.ChatCoffee.entity.Loaisanpham;
import com.DoAn.ChatCoffee.repository.ILoaiSanPhamRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiSanPhamService {
    @Autowired
    private ILoaiSanPhamRespository loaiSanPhamRespository;
    public List<Loaisanpham> getAllCategories(){
        return  loaiSanPhamRespository.findAll();

    }
    public  Loaisanpham getloaiSanphamByid(Long id){
        Optional<Loaisanpham> optionalLoaiSP = loaiSanPhamRespository.findById(id);
        if(optionalLoaiSP.isPresent()){
            return  optionalLoaiSP.get();
        }
        else {
            throw  new RuntimeException("Loai san pham not found");
        }


    }
    public  void  addLoaiSP(Loaisanpham id){
        loaiSanPhamRespository.save(id);
    }
    public  Loaisanpham saveLoaiSP(Loaisanpham id){
        return   loaiSanPhamRespository.save(id);

    }
    public  void  deleteLoaiSP(Long id){
        loaiSanPhamRespository.deleteById(id);

    }
}
