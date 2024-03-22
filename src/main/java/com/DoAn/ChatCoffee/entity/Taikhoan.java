package com.DoAn.ChatCoffee.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Taikhoan")
public class Taikhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", length = 50, nullable = false, unique = true)
    @NotBlank(message = "Username is required")
    @Size(max = 50, message = "Username must be less than 50 characters")
    private String username;

    @Column(name = "password", length = 250, nullable = false)
    @NotBlank(message = "Password is required")
    private String password;

    @Column(name = "email", length = 50)
    @NotBlank(message = "Password is required")
    @Size(max = 50, message = "Email must be less than 50 characters")
    private String email;

    @Column(name = "fullname", length = 50, nullable = false)
    @Size(max = 50, message = "Your fullname must be less than 50 characters")
    @NotBlank(message = "Your fullname is required")
    private String fullname;
    @Column(name = "image", length = 50, nullable = true)
    private String imgage;
    @Column(name = "dateofbirth", length = 50, nullable = false)
    @NotBlank(message = "Your dateofbirth is required")
    private String dateofbirth;
    @Column(name = "phonenumber", length = 10, nullable = false)
    @NotBlank(message = "Your phongnumber is required")
    private String phonenumber;
    @Column(name = "status", nullable = false)
    @NotBlank(message = "Your status is required")
    private Boolean status;

    @OneToMany(mappedBy = "taikhoan", cascade = CascadeType.ALL)
    private List<Diachi> diachis;

    @OneToMany(mappedBy = "taikhoan", cascade = CascadeType.ALL)
    private List<Hoadon> hoadons;

    @OneToOne(mappedBy = "taikhoan", cascade = CascadeType.ALL)
    private Giohang giohangs;
    @ManyToMany
    @JoinTable(name ="user_role",
            joinColumns = @JoinColumn(name ="user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
}
