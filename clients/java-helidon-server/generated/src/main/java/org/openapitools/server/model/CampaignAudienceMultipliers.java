package org.openapitools.server.model;

import java.util.HashMap;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */
public class CampaignAudienceMultipliers extends HashMap<String, Double>  {

    private String AUDIENCE_ID;

    /**
     * Default constructor.
     */
    public CampaignAudienceMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignAudienceMultipliers.
     *
     * @param AUDIENCE_ID Audience ID for the multiplier.
     */
    public CampaignAudienceMultipliers(
        String AUDIENCE_ID
    ) {
        this.AUDIENCE_ID = AUDIENCE_ID;
    }



    /**
     * Audience ID for the multiplier.
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
        sb.append("class CampaignAudienceMultipliers {\n");
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

