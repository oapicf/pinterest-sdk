package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignCommon;
import org.openapitools.model.CampaignResponseAllOf;
import org.openapitools.model.CampaignResponseAllOf1;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.TrackingUrls;

@Canonical
class CampaignResponse {
    /* Campaign ID. */
    String id
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
    
    ObjectiveType objectiveType
    /* Campaign creation time. Unix timestamp in seconds. */
    Integer createdTime
    /* UTC timestamp. Last update time. */
    Integer updatedTime
    /* Always \"campaign\". */
    String type
}
