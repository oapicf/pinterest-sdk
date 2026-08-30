package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import org.openapitools.model.DataStatus;

@Canonical
class PinAnalyticsDailyMetrics {
    
    DataStatus dataStatus
    /* Metrics date (UTC): YYYY-MM-DD. */
    String date
    
    Map<String, BigDecimal> metrics = new HashMap<>()
}
