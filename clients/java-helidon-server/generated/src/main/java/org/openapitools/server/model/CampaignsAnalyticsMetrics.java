package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CampaignsAnalyticsMetrics   {

    private String CAMPAIGN_ID;
    private LocalDate DATE;

    /**
     * Default constructor.
     */
    public CampaignsAnalyticsMetrics() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignsAnalyticsMetrics.
     *
     * @param CAMPAIGN_ID The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
     * @param DATE Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
     */
    public CampaignsAnalyticsMetrics(
        String CAMPAIGN_ID, 
        LocalDate DATE
    ) {
        this.CAMPAIGN_ID = CAMPAIGN_ID;
        this.DATE = DATE;
    }



    /**
     * The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
     * @return CAMPAIGN_ID
     */
    public String getCAMPAIGNID() {
        return CAMPAIGN_ID;
    }

    public void setCAMPAIGNID(String CAMPAIGN_ID) {
        this.CAMPAIGN_ID = CAMPAIGN_ID;
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
        sb.append("class CampaignsAnalyticsMetrics {\n");
        
        sb.append("    CAMPAIGN_ID: ").append(toIndentedString(CAMPAIGN_ID)).append("\n");
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

