package com.flatrent.model.Flat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class Flat {
    private String name;
    private String city;
    private String street;
    private Float area;
    private Integer rooms;


}
