package org.openapitools.server.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.model.PinAnalyticsDailyMetrics;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PinAnalyticsMetricsResponse   {

    private List<@Valid PinAnalyticsDailyMetrics> dailyMetrics = new ArrayList<>();
    private Map<String, Integer> lifetimeMetrics = new HashMap<>();
    private Map<String, BigDecimal> summaryMetrics = new HashMap<>();

    /**
     * Default constructor.
     */
    public PinAnalyticsMetricsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create PinAnalyticsMetricsResponse.
     *
     * @param dailyMetrics Array with the requested daily metric records
     * @param lifetimeMetrics The lifetime metric name and value.
     * @param summaryMetrics The metric name and value over the requested period for each requested metric
     */
    public PinAnalyticsMetricsResponse(
        List<@Valid PinAnalyticsDailyMetrics> dailyMetrics, 
        Map<String, Integer> lifetimeMetrics, 
        Map<String, BigDecimal> summaryMetrics
    ) {
        this.dailyMetrics = dailyMetrics;
        this.lifetimeMetrics = lifetimeMetrics;
        this.summaryMetrics = summaryMetrics;
    }



    /**
     * Array with the requested daily metric records
     * @return dailyMetrics
     */
    public List<@Valid PinAnalyticsDailyMetrics> getDailyMetrics() {
        return dailyMetrics;
    }

    public void setDailyMetrics(List<@Valid PinAnalyticsDailyMetrics> dailyMetrics) {
        this.dailyMetrics = dailyMetrics;
    }

    /**
     * The lifetime metric name and value.
     * @return lifetimeMetrics
     */
    public Map<String, Integer> getLifetimeMetrics() {
        return lifetimeMetrics;
    }

    public void setLifetimeMetrics(Map<String, Integer> lifetimeMetrics) {
        this.lifetimeMetrics = lifetimeMetrics;
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
        sb.append("class PinAnalyticsMetricsResponse {\n");
        
        sb.append("    dailyMetrics: ").append(toIndentedString(dailyMetrics)).append("\n");
        sb.append("    lifetimeMetrics: ").append(toIndentedString(lifetimeMetrics)).append("\n");
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

