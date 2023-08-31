package com.flatrent.model.Flat;

import com.flatrent.model.Person.Tenant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Room extends Flat {
    private String name;
    private Tenant tenant;
}
