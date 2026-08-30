package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from gender targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment.  All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
public class BidOptionsGenderMultipliers   {

    private BigDecimal female;
    private BigDecimal male;

    /**
     * Default constructor.
     */
    public BidOptionsGenderMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create BidOptionsGenderMultipliers.
     *
     * @param female female
     * @param male male
     */
    public BidOptionsGenderMultipliers(
        BigDecimal female, 
        BigDecimal male
    ) {
        this.female = female;
        this.male = male;
    }



    /**
     * Get female
     * @return female
     */
    public BigDecimal getFemale() {
        return female;
    }

    public void setFemale(BigDecimal female) {
        this.female = female;
    }

    /**
     * Get male
     * @return male
     */
    public BigDecimal getMale() {
        return male;
    }

    public void setMale(BigDecimal male) {
        this.male = male;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BidOptionsGenderMultipliers {\n");
        
        sb.append("    female: ").append(toIndentedString(female)).append("\n");
        sb.append("    male: ").append(toIndentedString(male)).append("\n");
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

