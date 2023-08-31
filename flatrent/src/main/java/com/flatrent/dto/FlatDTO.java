package com.flatrent.dto;

import com.flatrent.model.Person.Manager;
import com.flatrent.model.Person.Tenant;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FlatDTO {
    private String name;
    private String city;
    private String street;
    private Float area;
    private Integer rooms;
    private Tenant tenant;
    private Manager manager;
}
