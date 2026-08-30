package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TopPinsAnalyticsResponseDateAvailability   {

    private Boolean isRealtime;
    private BigDecimal latestAvailableTimestamp;

    /**
     * Default constructor.
     */
    public TopPinsAnalyticsResponseDateAvailability() {
    // JSON-B / Jackson
    }

    /**
     * Create TopPinsAnalyticsResponseDateAvailability.
     *
     * @param isRealtime isRealtime
     * @param latestAvailableTimestamp latestAvailableTimestamp
     */
    public TopPinsAnalyticsResponseDateAvailability(
        Boolean isRealtime, 
        BigDecimal latestAvailableTimestamp
    ) {
        this.isRealtime = isRealtime;
        this.latestAvailableTimestamp = latestAvailableTimestamp;
    }



    /**
     * Get isRealtime
     * @return isRealtime
     */
    public Boolean getIsRealtime() {
        return isRealtime;
    }

    public void setIsRealtime(Boolean isRealtime) {
        this.isRealtime = isRealtime;
    }

    /**
     * Get latestAvailableTimestamp
     * @return latestAvailableTimestamp
     */
    public BigDecimal getLatestAvailableTimestamp() {
        return latestAvailableTimestamp;
    }

    public void setLatestAvailableTimestamp(BigDecimal latestAvailableTimestamp) {
        this.latestAvailableTimestamp = latestAvailableTimestamp;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopPinsAnalyticsResponseDateAvailability {\n");
        
        sb.append("    isRealtime: ").append(toIndentedString(isRealtime)).append("\n");
        sb.append("    latestAvailableTimestamp: ").append(toIndentedString(latestAvailableTimestamp)).append("\n");
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

