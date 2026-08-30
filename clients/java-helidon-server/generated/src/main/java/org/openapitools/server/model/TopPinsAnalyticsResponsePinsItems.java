package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.DataStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Array with metrics, status, and pin id for the requested metric
 */
public class TopPinsAnalyticsResponsePinsItems   {

    private Map<String, DataStatus> dataStatus = new HashMap<>();
    private Map<String, BigDecimal> metrics = new HashMap<>();
    private String pinId;

    /**
     * Default constructor.
     */
    public TopPinsAnalyticsResponsePinsItems() {
    // JSON-B / Jackson
    }

    /**
     * Create TopPinsAnalyticsResponsePinsItems.
     *
     * @param dataStatus dataStatus
     * @param metrics metrics
     * @param pinId The pin id
     */
    public TopPinsAnalyticsResponsePinsItems(
        Map<String, DataStatus> dataStatus, 
        Map<String, BigDecimal> metrics, 
        String pinId
    ) {
        this.dataStatus = dataStatus;
        this.metrics = metrics;
        this.pinId = pinId;
    }



    /**
     * Get dataStatus
     * @return dataStatus
     */
    public Map<String, DataStatus> getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Map<String, DataStatus> dataStatus) {
        this.dataStatus = dataStatus;
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
     * The pin id
     * @return pinId
     */
    public String getPinId() {
        return pinId;
    }

    public void setPinId(String pinId) {
        this.pinId = pinId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopPinsAnalyticsResponsePinsItems {\n");
        
        sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

