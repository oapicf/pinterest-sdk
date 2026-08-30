package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MetricsResponseDataItems   {

    private Object metrics;
    private String targetingType;
    private String targetingValue;

    /**
     * Default constructor.
     */
    public MetricsResponseDataItems() {
    // JSON-B / Jackson
    }

    /**
     * Create MetricsResponseDataItems.
     *
     * @param metrics Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
     * @param targetingType The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
     * @param targetingValue The targeting value for this data item (e.g., &#39;christmas decor ideas&#39;, &#39;iphone&#39;, &#39;female&#39;)
     */
    public MetricsResponseDataItems(
        Object metrics, 
        String targetingType, 
        String targetingValue
    ) {
        this.metrics = metrics;
        this.targetingType = targetingType;
        this.targetingValue = targetingValue;
    }



    /**
     * Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
     * @return metrics
     */
    public Object getMetrics() {
        return metrics;
    }

    public void setMetrics(Object metrics) {
        this.metrics = metrics;
    }

    /**
     * The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
     * @return targetingType
     */
    public String getTargetingType() {
        return targetingType;
    }

    public void setTargetingType(String targetingType) {
        this.targetingType = targetingType;
    }

    /**
     * The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
     * @return targetingValue
     */
    public String getTargetingValue() {
        return targetingValue;
    }

    public void setTargetingValue(String targetingValue) {
        this.targetingValue = targetingValue;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricsResponseDataItems {\n");
        
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    targetingType: ").append(toIndentedString(targetingType)).append("\n");
        sb.append("    targetingValue: ").append(toIndentedString(targetingValue)).append("\n");
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

