package com.example.repos;

import com.example.entities.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepo extends JpaRepository<Coupon, Long> {
    Coupon findByCode(String code);
}
