package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AdeColumnType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CustomConversionEventMetrics   {

    private AdeColumnType customEventMetricsType;
    private String customEventName;

    /**
     * Default constructor.
     */
    public CustomConversionEventMetrics() {
    // JSON-B / Jackson
    }

    /**
     * Create CustomConversionEventMetrics.
     *
     * @param customEventMetricsType customEventMetricsType
     * @param customEventName Name of the advertiser-defined custom conversion event
     */
    public CustomConversionEventMetrics(
        AdeColumnType customEventMetricsType, 
        String customEventName
    ) {
        this.customEventMetricsType = customEventMetricsType;
        this.customEventName = customEventName;
    }



    /**
     * Get customEventMetricsType
     * @return customEventMetricsType
     */
    public AdeColumnType getCustomEventMetricsType() {
        return customEventMetricsType;
    }

    public void setCustomEventMetricsType(AdeColumnType customEventMetricsType) {
        this.customEventMetricsType = customEventMetricsType;
    }

    /**
     * Name of the advertiser-defined custom conversion event
     * @return customEventName
     */
    public String getCustomEventName() {
        return customEventName;
    }

    public void setCustomEventName(String customEventName) {
        this.customEventName = customEventName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomConversionEventMetrics {\n");
        
        sb.append("    customEventMetricsType: ").append(toIndentedString(customEventMetricsType)).append("\n");
        sb.append("    customEventName: ").append(toIndentedString(customEventName)).append("\n");
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

