package com.example.marketitex.Domain.Delevery;

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
@Entity(name="Delevery")
public class DeleveryEntity {

    @Id
    private String deleveryId;

    @Column
    private String deleveryNm;

    @Column
    private char deleveryYn;

    @Column
    private int deleveryTip;

    @Column
    private Timestamp deleveryDt;



}
