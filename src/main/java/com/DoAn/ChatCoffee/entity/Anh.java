package com.DoAn.ChatCoffee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

/*@Data
@Entity
@Table(name = "Anh")*/
public class Anh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LinkAnh")
    @Size(max = 100)
    private String LinkAnh;

/*    @ManyToOne
    @JoinColumn(name = "product_id")
    private Sanpham sanpham;*/
}
