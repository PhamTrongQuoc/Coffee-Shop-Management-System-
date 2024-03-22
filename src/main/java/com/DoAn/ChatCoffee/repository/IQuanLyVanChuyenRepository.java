package com.DoAn.ChatCoffee.repository;

import com.DoAn.ChatCoffee.entity.Giohang;
import com.DoAn.ChatCoffee.entity.Vanchuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuanLyVanChuyenRepository extends JpaRepository<Vanchuyen, Long> {

}
