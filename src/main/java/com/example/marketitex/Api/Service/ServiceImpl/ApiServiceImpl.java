package com.example.marketitex.Api.Service.ServiceImpl;

import com.example.marketitex.Api.Controller.Dto.OrderReq;
import com.example.marketitex.Api.Controller.Dto.OrderRes;
import com.example.marketitex.Api.Service.ApiService;
import com.example.marketitex.Domain.Order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public int insertOrder(OrderReq req) {
        int result =0;

        Map<String,Object> reqMap = new HashMap<>();
        reqMap.put("store_cd", req.getStoreCd());
        reqMap.put("order_cd", "BLF0002");
        reqMap.put("product_cnt", req.getProductCnt());
        reqMap.put("product_pay", req.getProductPay());
        reqMap.put("delevery_address", req.getDeleveryAddress());
        reqMap.put("order_yn", "B0");
        reqMap.put("delevery_way", req.getDeleveryWay());
        reqMap.put("customer_id", req.getCustomerId());

        return orderRepository.insertOrder(reqMap);

    }

    @Override
    public int updateOrder(OrderReq req) {
        return 0;
    }

    @Override
    public List<OrderRes> getSingleOrder() {
        return null;
    }

    @Override
    public List<OrderRes> getOrderList() {
        return null;
    }
}
