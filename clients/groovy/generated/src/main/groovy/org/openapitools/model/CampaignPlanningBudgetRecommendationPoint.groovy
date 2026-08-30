package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningPointEstimate;

@Canonical
class CampaignPlanningBudgetRecommendationPoint {
    /* Estimation type for this point. */
    CampaignPlanningEstimationType estimationType
    /* Point estimate data. */
    CampaignPlanningPointEstimate pointEstimate
}
