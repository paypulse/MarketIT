package com.example.marketitex.Domain.Store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StoreRepsitory extends JpaRepository<StoreEntity,Integer>, JpaSpecificationExecutor<StoreEntity> {
}
