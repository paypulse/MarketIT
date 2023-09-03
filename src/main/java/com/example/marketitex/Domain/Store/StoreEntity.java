package com.example.marketitex.Domain.Store;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="Store")
public class StoreEntity {

    @Id
    private int storeId;

    @Column
    private String storeCd;

    @Column
    private String storeNm;

    @Column
    private String productCd;

    @Column
    private String productNm;

    @Column
    private String deleveryId;

    @Column
    private String productYn;

    @Column
    private int orderPay;

}
