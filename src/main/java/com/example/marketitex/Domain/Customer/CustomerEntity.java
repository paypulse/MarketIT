package com.example.marketitex.Domain.Customer;


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
@Entity(name="CustomerEntity")
public class CustomerEntity {

    @Id
    private String customerId;

    @Column
    private String customerNm;

    @Column
    private String phoneNum;

    @Column
    private String cardNumber;

    @Column
    private Timestamp createDt;

    @Column
    private Timestamp modDt;

}
