package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ObjectiveType;

@Canonical
class CampaignResponseAllOf1 {
    
    ObjectiveType objectiveType
    /* Campaign creation time. Unix timestamp in seconds. */
    Integer createdTime
    /* UTC timestamp. Last update time. */
    Integer updatedTime
    /* Always \"campaign\". */
    String type
}
