package com.DoAn.ChatCoffee.repository;

import com.DoAn.ChatCoffee.entity.Thanhtoan;
import com.DoAn.ChatCoffee.entity.Vanchuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQuanLyThanhToanRepository extends JpaRepository<Thanhtoan, Long> {
}
