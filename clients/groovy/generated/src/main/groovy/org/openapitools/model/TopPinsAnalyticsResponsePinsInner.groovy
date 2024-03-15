package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import org.openapitools.model.DataStatus;

@Canonical
class TopPinsAnalyticsResponsePinsInner {
    /* The metric name and daily value for each requested metric */
    Map<String, BigDecimal> metrics = new HashMap<>()
    
    Map<String, DataStatus> dataStatus = new HashMap<>()
    /* The pin id */
    String pinId
}
