package com.DoAn.ChatCoffee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "Thanhtoan")
public class Thanhtoan {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private  Long id;

// phương thuc thanh toan
    @Column(name = "Thanhtoan", length = 50)
    @NotEmpty(message = "Không được để trống ")
    @Size(max = 50,min =1,message = "Tối đa 50 kí tự ")
    private  String hinhthuc;

    // trỏ khóa ngoại đên order
    @OneToMany(mappedBy = "Thanhtoan",cascade = CascadeType.ALL)
    private List<Hoadon> Hoadons;







}
