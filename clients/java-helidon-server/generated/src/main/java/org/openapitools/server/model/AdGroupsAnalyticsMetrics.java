package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdGroupsAnalyticsMetrics   {

    private String AD_GROUP_ID;
    private LocalDate DATE;

    /**
     * Default constructor.
     */
    public AdGroupsAnalyticsMetrics() {
    // JSON-B / Jackson
    }

    /**
     * Create AdGroupsAnalyticsMetrics.
     *
     * @param AD_GROUP_ID The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
     * @param DATE Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
     */
    public AdGroupsAnalyticsMetrics(
        String AD_GROUP_ID, 
        LocalDate DATE
    ) {
        this.AD_GROUP_ID = AD_GROUP_ID;
        this.DATE = DATE;
    }



    /**
     * The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
     * @return AD_GROUP_ID
     */
    public String getADGROUPID() {
        return AD_GROUP_ID;
    }

    public void setADGROUPID(String AD_GROUP_ID) {
        this.AD_GROUP_ID = AD_GROUP_ID;
    }

    /**
     * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
     * @return DATE
     */
    public LocalDate getDATE() {
        return DATE;
    }

    public void setDATE(LocalDate DATE) {
        this.DATE = DATE;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdGroupsAnalyticsMetrics {\n");
        
        sb.append("    AD_GROUP_ID: ").append(toIndentedString(AD_GROUP_ID)).append("\n");
        sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
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

