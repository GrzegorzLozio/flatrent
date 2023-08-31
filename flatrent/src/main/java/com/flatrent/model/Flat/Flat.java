package com.flatrent.model.Flat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.flatrent.model.Person.Manager;
import jakarta.persistence.*;
import lombok.*;

//@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "flat")
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "street", nullable = false)
    private String street;
    @Column(name = "area", nullable = false)
    private Float area;
    @Column(name = "rooms", nullable = false)
    private Integer rooms;
    // private Tenant tenant;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    @EqualsAndHashCode.Exclude
    private Manager manager;


//    private Long managerId;



}
