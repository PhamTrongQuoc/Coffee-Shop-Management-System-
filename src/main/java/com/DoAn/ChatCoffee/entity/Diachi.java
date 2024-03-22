package com.DoAn.ChatCoffee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "Diachi")
public class Diachi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaDC;


    @Column(name = "DiaChi")
    @NotNull(message = "Địa chỉ không được để trống!")
    @Size(max = 120)
    private String TenDiaChi;


    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private Taikhoan taikhoan;
}
