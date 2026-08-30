package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Gender demographic distribution
 */
public class GenderDemographics   {

    private BigDecimal female;
    private BigDecimal male;
    private BigDecimal unspecified;

    /**
     * Default constructor.
     */
    public GenderDemographics() {
    // JSON-B / Jackson
    }

    /**
     * Create GenderDemographics.
     *
     * @param female Percentage of female users
     * @param male Percentage of male users
     * @param unspecified Percentage of users with unspecified gender
     */
    public GenderDemographics(
        BigDecimal female, 
        BigDecimal male, 
        BigDecimal unspecified
    ) {
        this.female = female;
        this.male = male;
        this.unspecified = unspecified;
    }



    /**
     * Percentage of female users
     * @return female
     */
    public BigDecimal getFemale() {
        return female;
    }

    public void setFemale(BigDecimal female) {
        this.female = female;
    }

    /**
     * Percentage of male users
     * @return male
     */
    public BigDecimal getMale() {
        return male;
    }

    public void setMale(BigDecimal male) {
        this.male = male;
    }

    /**
     * Percentage of users with unspecified gender
     * @return unspecified
     */
    public BigDecimal getUnspecified() {
        return unspecified;
    }

    public void setUnspecified(BigDecimal unspecified) {
        this.unspecified = unspecified;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenderDemographics {\n");
        
        sb.append("    female: ").append(toIndentedString(female)).append("\n");
        sb.append("    male: ").append(toIndentedString(male)).append("\n");
        sb.append("    unspecified: ").append(toIndentedString(unspecified)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

