package com.example.marketitex.Api.Controller;

import com.example.marketitex.Api.Controller.Dto.OrderReq;
import com.example.marketitex.Api.Service.ApiService;
import com.example.marketitex.Common.CommonRes;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    //1. 주문 접수 처리
    @Operation(summary ="주문 접수 처리 ")
    @PostMapping(path="/order")
    public ResponseEntity<CommonRes> orderSuccess(@RequestBody OrderReq request){
        try{
            int rv =0;
            rv = apiService.insertOrder(request);
            if(rv >=1){
                return ResponseEntity.ok(CommonRes.builder()
                        .msg("주문이 처리 되었습니다. ")
                        .build());
            }else{
                return ResponseEntity.ok(CommonRes.builder()
                        .msg("주문이 실패 되었습니다.")
                        .build());
            }

        } catch (Exception e){
            return ResponseEntity.ok(CommonRes.builder()
                    .data(e)
                    .msg(e.getMessage())
                    .build());
        }




    }





}
