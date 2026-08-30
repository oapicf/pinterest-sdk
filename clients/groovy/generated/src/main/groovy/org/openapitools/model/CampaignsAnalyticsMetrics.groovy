package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CampaignsAnalyticsMetrics {
    /* The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true. */
    String CAMPAIGN_ID
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    Date DATE
}
