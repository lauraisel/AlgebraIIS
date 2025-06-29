package hr.algebra.linkedin_company.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String country;
    private String fullAddress;
    private Boolean isHeadquarter;
    private String line1;
    private String line2;
    private String region;
    private String zipcode;

    @ManyToMany(mappedBy = "locations")
    private List<Company> companies;
}
