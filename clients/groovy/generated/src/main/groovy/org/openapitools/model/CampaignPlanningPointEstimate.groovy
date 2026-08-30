package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CampaignPlanningPointEstimate {
    /* The budget value of the point. */
    Integer budget
    /* Y value as a decimal. */
    Double doubleY
    /* The maximum Y value of the point. */
    Integer maxY
    /* The minimum Y value of the point. */
    Integer minY
    /* The expected Y value of the point. */
    Integer y
}
