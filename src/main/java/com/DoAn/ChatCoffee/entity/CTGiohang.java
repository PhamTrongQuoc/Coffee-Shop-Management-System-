package com.DoAn.ChatCoffee.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CTGiohang")
public class CTGiohang {

    @EmbeddedId
    CartDetailsKey id;

    @ManyToOne
    @MapsId("CartMaHD")
    @JoinColumn(name = "MaHD")
    Giohang giohang;

    @ManyToOne
    @MapsId("ProductId")
    @JoinColumn(name = "id")
    Sanpham sanpham;

    @Column(name = "TongTien")
    private int TongTien;

    @Column(name = "TongSL")
    private int TongSL;

    @Column(name = "TongSP")
    private int TongSP;

}
