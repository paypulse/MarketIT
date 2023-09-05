package com.example.marketitex.Api.Service.ServiceImpl;

import com.example.marketitex.Api.Controller.Dto.OrderReq;
import com.example.marketitex.Api.Service.ApiService;
import com.example.marketitex.Domain.Order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public int insertOrder(OrderReq req) {


        LocalDate order_date = LocalDate.now();

        Map<String,Object> reqMap = new HashMap<>();
        reqMap.put("store_cd", req.getStoreCd());
        reqMap.put("order_cd", "BLF0002");
        reqMap.put("product_cnt", req.getProductCnt());
        reqMap.put("product_pay", req.getProductPay());
        reqMap.put("delevery_address", req.getDeleveryAddress());
        reqMap.put("order_yn", "B0");
        reqMap.put("delevery_way", req.getDeleveryWay());
        reqMap.put("customer_id", req.getCustomerId());
        reqMap.put("order_date", order_date);

        return orderRepository.insertOrder(reqMap);

    }

    @Override
    public int updateOrder(OrderReq req) {
        return 0;
    }


}
