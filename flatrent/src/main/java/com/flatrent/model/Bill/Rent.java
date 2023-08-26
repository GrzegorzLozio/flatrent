package com.flatrent.model.Bill;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Rent implements Bill {
    private Float value;
    private Date date;

}
