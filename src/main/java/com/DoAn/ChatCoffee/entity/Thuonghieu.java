package com.DoAn.ChatCoffee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "thuonghieu")
public class Thuonghieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaTH;

    @Column(name = "TenTH")
    @NotEmpty(message = "Tên thương hiệu không được để trống!")
    @Size(max = 50)
    private String TenTH;

    @Column(name = "DiaChiTH")
    @Size(max = 120)
    private String DiaChiTH;

    @Column(name = "AnhTH")
    @Size(max = 100)
    private String AnhTH;

    @OneToMany(mappedBy = "thuonghieus", cascade = CascadeType.ALL)
    private List<Sanpham> sanphams;
}
