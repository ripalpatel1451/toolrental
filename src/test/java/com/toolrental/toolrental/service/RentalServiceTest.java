package com.toolrental.toolrental.service;

import com.toolrental.toolrental.entity.RentalAgreement;
import com.toolrental.toolrental.exception.InvalidRentalException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class RentalServiceTest {

    @Autowired
    private RentalService rentalService;

    @Test
    public void testValidRental(){
        LocalDate checkoutDate = LocalDate.of(2020, 7, 2);
        RentalAgreement agreement = rentalService.rentTool("LADW", 3, 10, checkoutDate);

        //Assertions to verify the agreement details
    }

    @Test
    public void testInvalidDiscount(){
        LocalDate checkoutDate = LocalDate.of(2015, 9, 3);
        Assertions.assertThrows(InvalidRentalException.class, () -> {
            rentalService.rentTool("JAKR", 5, 101, checkoutDate);
        });
    }

    @Test
    public void testInvalidRentalDays() {
        LocalDate checkoutDate = LocalDate.of(2015, 7, 2);
        Assertions.assertThrows(InvalidRentalException.class, () -> {
            rentalService.rentTool("CHNS", 0, 25, checkoutDate);
        });
    }

    // missing test cases
}
