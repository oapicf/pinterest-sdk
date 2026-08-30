package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CampaignPlanningConversionAttributionWindowDays;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Attribution windows for a conversion event.
 */
public class CampaignPlanningConversionAttribution   {

    private CampaignPlanningConversionAttributionWindowDays clickWindowDays;
    private CampaignPlanningConversionAttributionWindowDays engagementWindowDays;
    private CampaignPlanningConversionAttributionWindowDays viewWindowDays;

    /**
     * Default constructor.
     */
    public CampaignPlanningConversionAttribution() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignPlanningConversionAttribution.
     *
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action.
     */
    public CampaignPlanningConversionAttribution(
        CampaignPlanningConversionAttributionWindowDays clickWindowDays, 
        CampaignPlanningConversionAttributionWindowDays engagementWindowDays, 
        CampaignPlanningConversionAttributionWindowDays viewWindowDays
    ) {
        this.clickWindowDays = clickWindowDays;
        this.engagementWindowDays = engagementWindowDays;
        this.viewWindowDays = viewWindowDays;
    }



    /**
     * Number of days to use as the conversion attribution window for a pin click action.
     * @return clickWindowDays
     */
    public CampaignPlanningConversionAttributionWindowDays getClickWindowDays() {
        return clickWindowDays;
    }

    public void setClickWindowDays(CampaignPlanningConversionAttributionWindowDays clickWindowDays) {
        this.clickWindowDays = clickWindowDays;
    }

    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
     * @return engagementWindowDays
     */
    public CampaignPlanningConversionAttributionWindowDays getEngagementWindowDays() {
        return engagementWindowDays;
    }

    public void setEngagementWindowDays(CampaignPlanningConversionAttributionWindowDays engagementWindowDays) {
        this.engagementWindowDays = engagementWindowDays;
    }

    /**
     * Number of days to use as the conversion attribution window for a view action.
     * @return viewWindowDays
     */
    public CampaignPlanningConversionAttributionWindowDays getViewWindowDays() {
        return viewWindowDays;
    }

    public void setViewWindowDays(CampaignPlanningConversionAttributionWindowDays viewWindowDays) {
        this.viewWindowDays = viewWindowDays;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignPlanningConversionAttribution {\n");
        
        sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
        sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
        sb.append("    viewWindowDays: ").append(toIndentedString(viewWindowDays)).append("\n");
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

