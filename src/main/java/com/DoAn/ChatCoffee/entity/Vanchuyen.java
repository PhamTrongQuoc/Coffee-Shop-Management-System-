package com.DoAn.ChatCoffee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name = "Vanchuyen")
public class Vanchuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MaVC;

    @Column(name = "TenVC")
    @NotEmpty(message = "Tên vận chuyển không được để trống!")
    @Size(max = 50)
    private String TenVC;

    @Column(name = "Gia")
    @NotNull(message = "Giá không được để trống!")
    private Long Gia;

    @OneToMany(mappedBy = "vanchuyen", cascade = CascadeType.ALL)
    private List<Hoadon> hoadons;
}
