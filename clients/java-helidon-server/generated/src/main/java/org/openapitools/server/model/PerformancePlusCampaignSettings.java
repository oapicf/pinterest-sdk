package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Pinterest Performance+ campaign settings.
 */
public class PerformancePlusCampaignSettings   {

    private Boolean boostProspectingAdGroupBid;
    private List<String> pinnerListExclusions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PerformancePlusCampaignSettings() {
    // JSON-B / Jackson
    }

    /**
     * Create PerformancePlusCampaignSettings.
     *
     * @param boostProspectingAdGroupBid Whether to boost prospecting ad group bid.
     * @param pinnerListExclusions List of campaign-level exclusion pinner list IDs.
     */
    public PerformancePlusCampaignSettings(
        Boolean boostProspectingAdGroupBid, 
        List<String> pinnerListExclusions
    ) {
        this.boostProspectingAdGroupBid = boostProspectingAdGroupBid;
        this.pinnerListExclusions = pinnerListExclusions;
    }



    /**
     * Whether to boost prospecting ad group bid.
     * @return boostProspectingAdGroupBid
     */
    public Boolean getBoostProspectingAdGroupBid() {
        return boostProspectingAdGroupBid;
    }

    public void setBoostProspectingAdGroupBid(Boolean boostProspectingAdGroupBid) {
        this.boostProspectingAdGroupBid = boostProspectingAdGroupBid;
    }

    /**
     * List of campaign-level exclusion pinner list IDs.
     * @return pinnerListExclusions
     */
    public List<String> getPinnerListExclusions() {
        return pinnerListExclusions;
    }

    public void setPinnerListExclusions(List<String> pinnerListExclusions) {
        this.pinnerListExclusions = pinnerListExclusions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PerformancePlusCampaignSettings {\n");
        
        sb.append("    boostProspectingAdGroupBid: ").append(toIndentedString(boostProspectingAdGroupBid)).append("\n");
        sb.append("    pinnerListExclusions: ").append(toIndentedString(pinnerListExclusions)).append("\n");
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

