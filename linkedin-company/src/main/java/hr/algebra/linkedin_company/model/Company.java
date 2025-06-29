package hr.algebra.linkedin_company.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyId;
    private String companyName;

    @Column(length = 5000)
    private String description;

    private String domain;
    private String email;
    private Integer employeeCount;
    private String employeeRange;
    private Integer followerCount;

    private String hqAddressLine1;
    private String hqAddressLine2;
    private String hqCity;
    private String hqCountry;
    private String hqFullAddress;
    private String hqPostalCode;
    private String hqRegion;

    private String linkedinUrl;
    private String logoUrl;
    private String phone;
    private String specialties;
    private String tagline;
    private String website;
    private Integer yearFounded;

    @ElementCollection
    @CollectionTable(name = "company_industries", joinColumns = @JoinColumn(name = "company_id"))
    @Column(name = "industry")
    private List<String> industries;

    @ElementCollection
    @CollectionTable(name = "affiliated_companies", joinColumns = @JoinColumn(name = "company_id"))
    @Column(name = "affiliated_company")
    private List<String> affiliatedCompanies;

    @ManyToMany
    @JoinTable(
            name = "company_location",
            joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "location_id")
    )
    @JsonManagedReference
    private List<Location> locations;

    @OneToOne(cascade = CascadeType.ALL)
    private FundingInfo fundingInfo;
}
