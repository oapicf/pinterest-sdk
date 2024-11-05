package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.openapitools.model.AnalyticsDailyMetrics;

@Canonical
class AnalyticsMetricsResponse {
    /* The metric name and value over the requested period for each requested metric */
    Map<String, BigDecimal> summaryMetrics = new HashMap<>()
    /* Array with the requested daily metric records */
    List<AnalyticsDailyMetrics> dailyMetrics = new ArrayList<>()
}
