package org.openapitools.server.model;

import java.util.HashMap;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from impression count to a bid price adjustment for frequency-based bidding.  Keys are impression counts (0-10) representing how many times a user has seen the ad. Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price. A value of 0 will stop distribution for this impression count. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
public class FrequencyMultipliers extends HashMap<String, Double>  {

    private String IMPRESSION_COUNT;

    /**
     * Default constructor.
     */
    public FrequencyMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create FrequencyMultipliers.
     *
     * @param IMPRESSION_COUNT Impression count identifier.
     */
    public FrequencyMultipliers(
        String IMPRESSION_COUNT
    ) {
        this.IMPRESSION_COUNT = IMPRESSION_COUNT;
    }



    /**
     * Impression count identifier.
     * @return IMPRESSION_COUNT
     */
    public String getIMPRESSIONCOUNT() {
        return IMPRESSION_COUNT;
    }

    public void setIMPRESSIONCOUNT(String IMPRESSION_COUNT) {
        this.IMPRESSION_COUNT = IMPRESSION_COUNT;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrequencyMultipliers {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    IMPRESSION_COUNT: ").append(toIndentedString(IMPRESSION_COUNT)).append("\n");
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

