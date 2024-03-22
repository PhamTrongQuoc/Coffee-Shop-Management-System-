package com.DoAn.ChatCoffee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//@Embeddable
public class CartDetailsKey implements Serializable {

        @Column(name = "product_id")
        private Long product_id;
        @Column(name = "cart_id")
        private Long cart_id;

        public Long getProduct_id() {
                return product_id;
        }

        public void setProduct_id(Long product_id) {
                this.product_id = product_id;
        }

        public Long getCart_id() {
                return cart_id;
        }

        public void setCart_id(Long cart_id) {
                this.cart_id = cart_id;
        }
}
