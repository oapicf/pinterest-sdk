package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CampaignPlanningAdGroupAudienceSize {
    /* Lower bound of the audience size estimate. */
    Integer countLower
    /* Upper bound of the audience size estimate. */
    Integer countUpper
}
