package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CampaignPlanningConversionAttribution;
import org.openapitools.server.model.CampaignPlanningConversionEvent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 */
public class CampaignPlanningConversionRate   {

    private CampaignPlanningConversionAttribution attributionWindows;
    private CampaignPlanningConversionEvent conversionEvent;
    private Float conversionRate;

    /**
     * Default constructor.
     */
    public CampaignPlanningConversionRate() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignPlanningConversionRate.
     *
     * @param attributionWindows attributionWindows
     * @param conversionEvent conversionEvent
     * @param conversionRate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
     */
    public CampaignPlanningConversionRate(
        CampaignPlanningConversionAttribution attributionWindows, 
        CampaignPlanningConversionEvent conversionEvent, 
        Float conversionRate
    ) {
        this.attributionWindows = attributionWindows;
        this.conversionEvent = conversionEvent;
        this.conversionRate = conversionRate;
    }



    /**
     * Get attributionWindows
     * @return attributionWindows
     */
    public CampaignPlanningConversionAttribution getAttributionWindows() {
        return attributionWindows;
    }

    public void setAttributionWindows(CampaignPlanningConversionAttribution attributionWindows) {
        this.attributionWindows = attributionWindows;
    }

    /**
     * Get conversionEvent
     * @return conversionEvent
     */
    public CampaignPlanningConversionEvent getConversionEvent() {
        return conversionEvent;
    }

    public void setConversionEvent(CampaignPlanningConversionEvent conversionEvent) {
        this.conversionEvent = conversionEvent;
    }

    /**
     * Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
     * @return conversionRate
     */
    public Float getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Float conversionRate) {
        this.conversionRate = conversionRate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignPlanningConversionRate {\n");
        
        sb.append("    attributionWindows: ").append(toIndentedString(attributionWindows)).append("\n");
        sb.append("    conversionEvent: ").append(toIndentedString(conversionEvent)).append("\n");
        sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
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

