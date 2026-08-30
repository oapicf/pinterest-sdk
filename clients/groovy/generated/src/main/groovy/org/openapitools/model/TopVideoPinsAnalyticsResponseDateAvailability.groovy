package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class TopVideoPinsAnalyticsResponseDateAvailability {
    
    Boolean isRealtime
    
    BigDecimal latestAvailableTimestamp
}
