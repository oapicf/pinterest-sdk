package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.DataStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PinAnalyticsDailyMetrics   {

    private DataStatus dataStatus;
    private String date;
    private Map<String, BigDecimal> metrics = new HashMap<>();

    /**
     * Default constructor.
     */
    public PinAnalyticsDailyMetrics() {
    // JSON-B / Jackson
    }

    /**
     * Create PinAnalyticsDailyMetrics.
     *
     * @param dataStatus dataStatus
     * @param date Metrics date (UTC): YYYY-MM-DD.
     * @param metrics metrics
     */
    public PinAnalyticsDailyMetrics(
        DataStatus dataStatus, 
        String date, 
        Map<String, BigDecimal> metrics
    ) {
        this.dataStatus = dataStatus;
        this.date = date;
        this.metrics = metrics;
    }



    /**
     * Get dataStatus
     * @return dataStatus
     */
    public DataStatus getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(DataStatus dataStatus) {
        this.dataStatus = dataStatus;
    }

    /**
     * Metrics date (UTC): YYYY-MM-DD.
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public Map<String, BigDecimal> getMetrics() {
        return metrics;
    }

    public void setMetrics(Map<String, BigDecimal> metrics) {
        this.metrics = metrics;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinAnalyticsDailyMetrics {\n");
        
        sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

