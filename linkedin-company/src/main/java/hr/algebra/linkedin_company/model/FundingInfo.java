package hr.algebra.linkedin_company.model;

import jakarta.persistence.*;

@Entity
public class FundingInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String crunchbaseUrl;
    private String lastFundingRoundAmount;
    private String lastFundingRoundCurrency;
    private Integer lastFundingRoundMonth;
    private String lastFundingRoundType;
    private Integer lastFundingRoundYear;
    private Integer numFundingRounds;
}
