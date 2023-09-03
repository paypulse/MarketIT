package com.example.marketitex.Api.Controller;

import com.example.marketitex.Common.CommonRes;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    //1. 주문 접수 처리
    @Operation(summary ="주문 접수 처리 ")
    @PostMapping(path="/order")
    public ResponseEntity<CommonRes> orderSuccess(){


        return ResponseEntity.ok(CommonRes.builder()
                .data("주문 완료")
                .msg("주문 완료")
                .build());
    }





}
