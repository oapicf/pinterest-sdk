package org.openapitools.server.model;

import java.util.HashMap;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
public class ScheduleAudienceMultipliers extends HashMap<String, Double>  {

    private String AUDIENCE_ID;

    /**
     * Default constructor.
     */
    public ScheduleAudienceMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create ScheduleAudienceMultipliers.
     *
     * @param AUDIENCE_ID AUDIENCE_ID
     */
    public ScheduleAudienceMultipliers(
        String AUDIENCE_ID
    ) {
        this.AUDIENCE_ID = AUDIENCE_ID;
    }



    /**
     * Get AUDIENCE_ID
     * @return AUDIENCE_ID
     */
    public String getAUDIENCEID() {
        return AUDIENCE_ID;
    }

    public void setAUDIENCEID(String AUDIENCE_ID) {
        this.AUDIENCE_ID = AUDIENCE_ID;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleAudienceMultipliers {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    AUDIENCE_ID: ").append(toIndentedString(AUDIENCE_ID)).append("\n");
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

