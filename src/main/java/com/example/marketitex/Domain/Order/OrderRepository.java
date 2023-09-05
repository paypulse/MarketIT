package com.example.marketitex.Domain.Order;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Integer>, JpaSpecificationExecutor<OrderEntity> {

    @Modifying
    @Query(value= " INSERT INTO order values(" +
            ":#{#reqMap.store_cd}," +
            ":#{#reqMap.order_cd}," +
            ":#{#reqMap.product_cnt}," +
            ":#{#reqMap.product_pay}," +
            ":#{#reqMap.delevery_address}," +
            ":#{#reqMap.order_yn}," +
            ":#{#reqMap.delevery_way}," +
            ":#{#reqMap.customer_id}," +
            ":#{#reqMap.order_date}) ", nativeQuery = true)
    int insertOrder(@Param("reqMap") Map<String,Object> reqMap );



}
