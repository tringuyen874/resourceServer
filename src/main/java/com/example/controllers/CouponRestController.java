package com.example.controllers;

import com.example.entities.Coupon;
import com.example.repos.CouponRepo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
    @Autowired
    CouponRepo repo;

    @PostMapping("/coupons")
    public Coupon create(@RequestBody Coupon coupon) {
        return repo.save(coupon);
    }

    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable("code") String code){
        return repo.findByCode(code);
    }
}
