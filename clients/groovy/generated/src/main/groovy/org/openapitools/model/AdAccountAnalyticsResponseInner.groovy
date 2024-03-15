package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class AdAccountAnalyticsResponseInner {
    /* The ID of the advertiser that this metrics belongs to. */
    String AD_ACCOUNT_ID
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    Date DATE
}
