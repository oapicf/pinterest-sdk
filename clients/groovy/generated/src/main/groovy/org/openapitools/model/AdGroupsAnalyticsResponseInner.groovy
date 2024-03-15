package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class AdGroupsAnalyticsResponseInner {
    /* The ID of the ad group that this metrics belongs to. */
    String AD_GROUP_ID
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    Date DATE
}
