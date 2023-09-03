package com.example.marketitex.Domain.Order;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="Order")
public class OrderEntity {

    @Id
    private int orderId;

    @Column
    private String customerId;

    @Column
    private String storeCd;

    @Column
    private String orderCd;

    @Column
    private int productCnt;

    @Column
    private int productPay;

    @Column
    private String deleveryAddress;

    @Column
    private String orderYn;

    @Column
    private String deleveryWay;

    @Column
    private Timestamp orderDate;

}
