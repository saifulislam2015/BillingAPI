package com.api.repo;

import com.api.model.BillingTiers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBillingTiers extends JpaRepository<BillingTiers,Long> {
    @Query(value = "Select distinct DeviceId from TigerITMDM.dbo.Billing_Tiers_Data",nativeQuery = true)
    List<String> findDevices();

    @Query(value = "Select * from TigerITMDM.dbo.Billing_Tiers_Data where DeviceId = :id and BillingDateTime " +
            "between :st and :end ",nativeQuery = true)
    List<BillingTiers> findBillingTiersByDateTimeAndDeviceId(@Param("id")String id, @Param("st")String st,
                                                             @Param("end")String end);


}
