package com.toolrental.toolrental.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;

    private String type;

    private String brand;

    private double dailyCharge;

    private boolean weekdayCharge;

    private boolean weekendCharge;

    private boolean holidayCharge;

}
