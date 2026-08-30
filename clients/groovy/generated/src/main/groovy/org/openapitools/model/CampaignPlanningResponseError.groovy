package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningResponseErrorCode;

@Canonical
class CampaignPlanningResponseError {
    
    CampaignPlanningResponseErrorCode code
    /* Human-readable error message. */
    String message
}
