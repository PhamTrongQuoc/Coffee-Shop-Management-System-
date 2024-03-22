package com.DoAn.ChatCoffee.service;

import com.DoAn.ChatCoffee.entity.Sanpham;
import com.DoAn.ChatCoffee.repository.ISanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SanPhamService {
    @Autowired
    private ISanPhamRepository sanPhamRepository;

    public List<Sanpham> getAllProduct(){
        return sanPhamRepository.findAll();
    }
    public Sanpham getProductByID(Long product_id){
        Optional<Sanpham> optional = sanPhamRepository.findById(product_id);
        return  optional.orElse(null);
    }

    public void saveProduct(Sanpham product){
        sanPhamRepository.save(product);
    }

    public void deleteProductByID(Long product_id){
        this.sanPhamRepository.deleteById(product_id);
    }


}
