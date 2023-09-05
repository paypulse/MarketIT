package com.example.marketitex.Api.Service;

import com.example.marketitex.Api.Controller.Dto.OrderReq;

import java.util.List;

public interface ApiService {

    //주문 접수
    public int insertOrder(OrderReq req);

    //주문 완료
    public int updateOrder(OrderReq req);



}
