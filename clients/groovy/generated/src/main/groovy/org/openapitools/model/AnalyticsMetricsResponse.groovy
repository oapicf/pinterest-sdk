package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.openapitools.model.AnalyticsMetricsResponseDailyMetrics;

@Canonical
class AnalyticsMetricsResponse {
    /* Array with the requested daily metric records */
    List<AnalyticsMetricsResponseDailyMetrics> dailyMetrics = new ArrayList<AnalyticsMetricsResponseDailyMetrics>()
    /* The metric name and value over the requested period for each requested metric */
    Map<String, BigDecimal> summaryMetrics = new HashMap<String, BigDecimal>()
}
