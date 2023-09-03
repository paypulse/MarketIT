package com.example.marketitex.Domain.Delevery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DeleveryRepository extends JpaRepository<DeleveryEntity,Integer>, JpaSpecificationExecutor<DeleveryEntity> {
}
