package com.toolrental.toolrental.service;

import com.toolrental.toolrental.entity.RentalAgreement;
import com.toolrental.toolrental.entity.Tool;
import com.toolrental.toolrental.exception.InvalidRentalException;
import com.toolrental.toolrental.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RentalService {

    @Autowired
    private ToolRepository toolRepository;

    public RentalAgreement rentTool(
            String toolCode,
            int rentalDays,
            int discountPercent,
            LocalDate checkoutDate) {

        // Validate inputs
        if (rentalDays < 1) {
            throw new InvalidRentalException("Rental day count must be 1 or greater");
        }

        if(discountPercent < 0 || discountPercent > 100){
            throw new InvalidRentalException("Discount percent must be between 0 and 100.");
        }

        // Fetch tool details
        Tool tool = toolRepository.findById(toolCode)
                .orElseThrow(() -> new InvalidRentalException("Invalid tool code"));

        // Calculate rental agreement details


        // Return rental agreement
        return new RentalAgreement();
    }
}
