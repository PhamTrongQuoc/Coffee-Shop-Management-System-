package com.DoAn.ChatCoffee.repository;

import com.DoAn.ChatCoffee.entity.Loaisanpham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoaiSanPhamRespository extends JpaRepository<Loaisanpham, Long> {
}
