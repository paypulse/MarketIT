package com.example.marketitex.Domain.Order;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Map;

public interface OrderRepository extends JpaRepository<OrderEntity,Integer>, JpaSpecificationExecutor<OrderEntity> {

    @Transactional
    @Query(value= " INSERT INTO order values(:#{reqMap.store_cd},    ) ", nativeQuery = true)
    int insertOrder(@Param("reqMap") Map<String,Object> reqMap );



}
