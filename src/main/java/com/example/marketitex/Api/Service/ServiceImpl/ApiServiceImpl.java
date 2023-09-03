package com.example.marketitex.Api.Service.ServiceImpl;

import com.example.marketitex.Api.Controller.Dto.OrderReq;
import com.example.marketitex.Api.Controller.Dto.OrderRes;
import com.example.marketitex.Api.Service.ApiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {


    @Override
    public int insertOrder(OrderReq req) {

        //회원 조회


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
