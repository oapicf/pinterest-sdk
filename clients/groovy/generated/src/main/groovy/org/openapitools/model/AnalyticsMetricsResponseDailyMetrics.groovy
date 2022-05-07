package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

@Canonical
class AnalyticsMetricsResponseDailyMetrics {
    /* Metrics availablity, e.g., \"READY\". */
    String dataStatus
    /* Metrics date (UTC): YYYY-MM-DD. */
    String date
    /* The metric name and daily value for each requested metric */
    Map<String, BigDecimal> metrics = new HashMap<String, BigDecimal>()
}
