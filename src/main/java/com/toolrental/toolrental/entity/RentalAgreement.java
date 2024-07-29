package com.toolrental.toolrental.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RentalAgreement {

    private String toolCode;

    private String toolType;

    private String toolBrand;

    private int rentalDays;

    private LocalDate checkoutDate;

    private LocalDate dueDate;

    private double dailyRentalCharge;

    private int chargeDays;

    private double preDiscountCharge;

    private int discountPercent;

    private double discountAmount;

    private double finalCharge;
}
