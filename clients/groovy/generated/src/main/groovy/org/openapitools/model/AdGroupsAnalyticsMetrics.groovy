package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AdGroupsAnalyticsMetrics {
    /* The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true. */
    String AD_GROUP_ID
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    Date DATE
}
