package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
public class BidOptionsAudienceMultipliers   {

    private String audienceId;
    private BigDecimal multiplier;

    /**
     * Default constructor.
     */
    public BidOptionsAudienceMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create BidOptionsAudienceMultipliers.
     *
     * @param audienceId audienceId
     * @param multiplier multiplier
     */
    public BidOptionsAudienceMultipliers(
        String audienceId, 
        BigDecimal multiplier
    ) {
        this.audienceId = audienceId;
        this.multiplier = multiplier;
    }



    /**
     * Get audienceId
     * @return audienceId
     */
    public String getAudienceId() {
        return audienceId;
    }

    public void setAudienceId(String audienceId) {
        this.audienceId = audienceId;
    }

    /**
     * Get multiplier
     * @return multiplier
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(BigDecimal multiplier) {
        this.multiplier = multiplier;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BidOptionsAudienceMultipliers {\n");
        
        sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
        sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
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

