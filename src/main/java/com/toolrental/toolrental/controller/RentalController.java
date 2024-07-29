package com.toolrental.toolrental.controller;

import com.toolrental.toolrental.entity.RentalAgreement;
import com.toolrental.toolrental.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/rental")
public class RentalController {

    @Autowired
    private RentalService rentalService;

    public RentalAgreement checkout(@RequestParam String toolCode,
                                    @RequestParam int rentalDays,
                                    @RequestParam int discountPercent,
                                    @RequestParam String checkoutDate){

        LocalDate date = LocalDate.parse(checkoutDate);
        return rentalService.rentTool(toolCode, rentalDays, discountPercent, date);
    }
}
