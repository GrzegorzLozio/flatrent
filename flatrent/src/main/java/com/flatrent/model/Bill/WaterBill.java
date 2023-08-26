package com.flatrent.model.Bill;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class WaterBill implements Bill {
    private Float quantity;
    private String unit;
    private Float value;
    private Date date;

}
