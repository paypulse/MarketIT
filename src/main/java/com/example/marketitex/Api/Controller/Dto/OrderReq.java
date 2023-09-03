package com.example.marketitex.Api.Controller.Dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class OrderReq {

    //회원 번호
    private String customerId;
    //배달 방식
    private String deleveryWay;
    //배달 주소
    private String deleveryAddress;
    //결제 금액
    private int productPay;
    //상품 수량
    private int productCnt;


}
