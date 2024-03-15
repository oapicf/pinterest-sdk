package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class CampaignsAnalyticsResponseInner {
    /* The ID of the campaing that this metrics belongs to. */
    String CAMPAIGN_ID
    /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
    Date DATE
}
