package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.HashMap;
import org.openapitools.model.DataStatus;

@Canonical
class TopVideoPinsAnalyticsResponsePinsItems {
    
    Map<String, DataStatus> dataStatus = new HashMap<>()
    
    Map<String, BigDecimal> metrics = new HashMap<>()
    /* The pin id */
    String pinId
}
