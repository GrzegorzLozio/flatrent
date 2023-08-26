package com.flatrent.model.Person;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tenant implements Person {

    private String name;
    @Override
    public void readTheWaterMeter() {

    }
}
