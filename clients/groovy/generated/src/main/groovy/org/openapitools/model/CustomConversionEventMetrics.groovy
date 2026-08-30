package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdeColumnType;

@Canonical
class CustomConversionEventMetrics {
    
    AdeColumnType customEventMetricsType
    /* Name of the advertiser-defined custom conversion event */
    String customEventName
}
