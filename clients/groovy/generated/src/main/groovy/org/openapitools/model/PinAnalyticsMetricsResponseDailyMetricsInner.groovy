package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import org.openapitools.model.DataStatus;

@Canonical
class PinAnalyticsMetricsResponseDailyMetricsInner {
    
    DataStatus dataStatus
    /* Metrics date (UTC): YYYY-MM-DD. */
    String date
    /* The metric name and daily value for each requested metric */
    Map<String, BigDecimal> metrics = new HashMap<>()
}
