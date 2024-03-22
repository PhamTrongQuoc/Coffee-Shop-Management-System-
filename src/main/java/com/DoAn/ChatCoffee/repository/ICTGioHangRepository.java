package com.DoAn.ChatCoffee.repository;

import com.DoAn.ChatCoffee.entity.CTGiohang;
import com.DoAn.ChatCoffee.entity.CartDetailsKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICTGioHangRepository extends JpaRepository<CTGiohang, CartDetailsKey> {
}
