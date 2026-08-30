package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AttributionWindows;
import org.openapitools.server.model.ConversionEvent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConversionTagV3GoalMetadata   {

    private AttributionWindows attributionWindows;
    private ConversionEvent conversionEvent;
    private String conversionTagId;
    private String cpaGoalValueInMicroCurrency;
    private Boolean isRoasOptimized;
    private String reportingEvent;

    /**
     * Default constructor.
     */
    public ConversionTagV3GoalMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionTagV3GoalMetadata.
     *
     * @param attributionWindows attributionWindows
     * @param conversionEvent conversionEvent
     * @param conversionTagId conversionTagId
     * @param cpaGoalValueInMicroCurrency cpaGoalValueInMicroCurrency
     * @param isRoasOptimized Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
     * @param reportingEvent Event name for custom or standard events mapped to an oCPM model
     */
    public ConversionTagV3GoalMetadata(
        AttributionWindows attributionWindows, 
        ConversionEvent conversionEvent, 
        String conversionTagId, 
        String cpaGoalValueInMicroCurrency, 
        Boolean isRoasOptimized, 
        String reportingEvent
    ) {
        this.attributionWindows = attributionWindows;
        this.conversionEvent = conversionEvent;
        this.conversionTagId = conversionTagId;
        this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
        this.isRoasOptimized = isRoasOptimized;
        this.reportingEvent = reportingEvent;
    }



    /**
     * Get attributionWindows
     * @return attributionWindows
     */
    public AttributionWindows getAttributionWindows() {
        return attributionWindows;
    }

    public void setAttributionWindows(AttributionWindows attributionWindows) {
        this.attributionWindows = attributionWindows;
    }

    /**
     * Get conversionEvent
     * @return conversionEvent
     */
    public ConversionEvent getConversionEvent() {
        return conversionEvent;
    }

    public void setConversionEvent(ConversionEvent conversionEvent) {
        this.conversionEvent = conversionEvent;
    }

    /**
     * Get conversionTagId
     * @return conversionTagId
     */
    public String getConversionTagId() {
        return conversionTagId;
    }

    public void setConversionTagId(String conversionTagId) {
        this.conversionTagId = conversionTagId;
    }

    /**
     * Get cpaGoalValueInMicroCurrency
     * @return cpaGoalValueInMicroCurrency
     */
    public String getCpaGoalValueInMicroCurrency() {
        return cpaGoalValueInMicroCurrency;
    }

    public void setCpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
        this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
    }

    /**
     * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
     * @return isRoasOptimized
     */
    public Boolean getIsRoasOptimized() {
        return isRoasOptimized;
    }

    public void setIsRoasOptimized(Boolean isRoasOptimized) {
        this.isRoasOptimized = isRoasOptimized;
    }

    /**
     * Event name for custom or standard events mapped to an oCPM model
     * @return reportingEvent
     */
    public String getReportingEvent() {
        return reportingEvent;
    }

    public void setReportingEvent(String reportingEvent) {
        this.reportingEvent = reportingEvent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionTagV3GoalMetadata {\n");
        
        sb.append("    attributionWindows: ").append(toIndentedString(attributionWindows)).append("\n");
        sb.append("    conversionEvent: ").append(toIndentedString(conversionEvent)).append("\n");
        sb.append("    conversionTagId: ").append(toIndentedString(conversionTagId)).append("\n");
        sb.append("    cpaGoalValueInMicroCurrency: ").append(toIndentedString(cpaGoalValueInMicroCurrency)).append("\n");
        sb.append("    isRoasOptimized: ").append(toIndentedString(isRoasOptimized)).append("\n");
        sb.append("    reportingEvent: ").append(toIndentedString(reportingEvent)).append("\n");
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

