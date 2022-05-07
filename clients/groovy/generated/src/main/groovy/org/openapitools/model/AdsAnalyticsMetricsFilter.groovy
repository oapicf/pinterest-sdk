package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AdsAnalyticsFilterColumn;
import org.openapitools.model.AdsAnalyticsFilterOperator;

@Canonical
class AdsAnalyticsMetricsFilter {
    
    AdsAnalyticsFilterColumn field
    
    AdsAnalyticsFilterOperator operator
    /* List of values for filtering */
    List<BigDecimal> values = new ArrayList<BigDecimal>()
}
