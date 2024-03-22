package com.DoAn.ChatCoffee.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Giohang")
public class Giohang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaGH;

    @Column(name = "TongTien")
    private int TongTien;

    @Column(name = "TongSL")
    private int TongSL;

    @Column(name = "TongSP")
    private int TongSP;

    @OneToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private Taikhoan taikhoan;
   /* @OneToMany(mappedBy = "giohangs", cascade = CascadeType.ALL)
    private List<CTGiohang> ctGiohangs;*/
}
