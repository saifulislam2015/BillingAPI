package com.api.repo;

import com.api.model.Tier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ITierRepo extends JpaRepository<Tier,Long> {

    @Query(value = "Select * from TigerITMDM.dbo.Billing_Tier_Data where DeviceId = :id and BillingDateTime " +
            "= :date ",nativeQuery = true)
    List<Tier> findTierByDateTimeAndDeviceId(@Param("id")String id, @Param("date")String date);
}
