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





        



        return 0;
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
