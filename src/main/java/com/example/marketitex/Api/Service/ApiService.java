package com.example.marketitex.Api.Service;

import com.example.marketitex.Api.Controller.Dto.OrderReq;
import com.example.marketitex.Api.Controller.Dto.OrderRes;
import jakarta.persistence.criteria.Order;

import java.util.List;

public interface ApiService {

    //주문 접수
    public int insertOrder(OrderReq req);

    //주문 완료
    public int updateOrder(OrderReq req);

    //단일 주문 조회
    public List<OrderRes> getSingleOrder();
    
    //주문 목록 조회
    public List<OrderRes> getOrderList();


}
