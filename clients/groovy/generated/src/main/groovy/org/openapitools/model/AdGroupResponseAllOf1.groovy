package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ActionType;

@Canonical
class AdGroupResponseAllOf1 {
    /* Campaign ID of the ad group. */
    String campaignId
    
    ActionType billableEvent
    /* Ad group ID. */
    String id
    /* Always \"adgroup\". */
    String type
    /* Advertiser ID. */
    String adAccountId
    /* Ad group creation time. Unix timestamp in seconds. */
    Integer createdTime
    /* Ad group last update time. Unix timestamp in seconds. */
    Integer updatedTime
}
