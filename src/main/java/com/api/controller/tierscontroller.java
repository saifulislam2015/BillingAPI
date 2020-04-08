package com.api.controller;

import com.api.model.*;
import com.api.repo.IBillingTiers;
import com.api.repo.ITierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
public class tierscontroller {
    @Autowired(required=true)
    private IBillingTiers repository;
    @Autowired(required=true)
    private ITierRepo billingRepo;

    @GetMapping("/devices")
    public List<Device> getDevices(){
        List<String> u = repository.findDevices();
        String[] arr = {
                "NES18100019323","NES18100019329","NES18100019688","NES18100019689",
                "NES18100019690","NES18100019691","NES18100019692", "NES18100019693",
                "NES18100005941","NES18100005942","NES18100008917","NES18100008918","NES18100008919"
        };
        List<Device> dd = new ArrayList<Device>();
        for(int i=0;i<u.size();i++){
            dd.add(new Device(u.get(i), arr[i]));
        }
        return dd;
    }

    @PostMapping("/billingrows")
    public BillingInfo getBillingRows(@Valid @RequestBody paramModel model){
        List<Row> rows = new ArrayList<>();
        List<BillingTiers> sumTiers =  repository.findBillingTiersByDateTimeAndDeviceId(model.get_id(),model.get_startDate(),
                model.get_endDate());

        for(int i=0;i<sumTiers.size();i++){
            List<Tier> tiers = billingRepo.findTierByDateTimeAndDeviceId(model.get_id(),sumTiers.get(i).getpK().get_dateTime());
            BillingInfo bill = new BillingInfo(sumTiers.get(i),tiers);
            rows.addAll(bill.getRows());
        }
        return new BillingInfo(rows);

    }

    @GetMapping("/sumtiers")
    public List<BillingTiers> getTiers(){
        return repository.findAll();
    }

    @GetMapping("/tiers")
    public List<Tier> getIndexTiers(){
        return billingRepo.findAll();
    }
}
