package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.TrackingUrls;

@Canonical
class CampaignCommon {
    /* Campaign's Advertiser ID. */
    String adAccountId
    /* Campaign name. */
    String name
    
    EntityStatus status = "ACTIVE"
    /* Campaign total spending cap. */
    Integer lifetimeSpendCap
    /* Campaign daily spending cap. */
    Integer dailySpendCap
    /* Order line ID that appears on the invoice. */
    String orderLineId
    
    TrackingUrls trackingUrls
    /* Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    Integer startTime
    /* Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    Integer endTime
}
