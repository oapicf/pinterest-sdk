package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.model.AnalyticsDailyMetrics;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AnalyticsMetricsResponse   {

    private List<@Valid AnalyticsDailyMetrics> dailyMetrics = new ArrayList<>();
    private Map<String, BigDecimal> summaryMetrics = new HashMap<>();

    /**
     * Default constructor.
     */
    public AnalyticsMetricsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create AnalyticsMetricsResponse.
     *
     * @param dailyMetrics Array with the requested daily metric records
     * @param summaryMetrics The metric name and value over the requested period for each requested metric
     */
    public AnalyticsMetricsResponse(
        List<@Valid AnalyticsDailyMetrics> dailyMetrics, 
        Map<String, BigDecimal> summaryMetrics
    ) {
        this.dailyMetrics = dailyMetrics;
        this.summaryMetrics = summaryMetrics;
    }



    /**
     * Array with the requested daily metric records
     * @return dailyMetrics
     */
    public List<@Valid AnalyticsDailyMetrics> getDailyMetrics() {
        return dailyMetrics;
    }

    public void setDailyMetrics(List<@Valid AnalyticsDailyMetrics> dailyMetrics) {
        this.dailyMetrics = dailyMetrics;
    }

    /**
     * The metric name and value over the requested period for each requested metric
     * @return summaryMetrics
     */
    public Map<String, BigDecimal> getSummaryMetrics() {
        return summaryMetrics;
    }

    public void setSummaryMetrics(Map<String, BigDecimal> summaryMetrics) {
        this.summaryMetrics = summaryMetrics;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyticsMetricsResponse {\n");
        
        sb.append("    dailyMetrics: ").append(toIndentedString(dailyMetrics)).append("\n");
        sb.append("    summaryMetrics: ").append(toIndentedString(summaryMetrics)).append("\n");
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

