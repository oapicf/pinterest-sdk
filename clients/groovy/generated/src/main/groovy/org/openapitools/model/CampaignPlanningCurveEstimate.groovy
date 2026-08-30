package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CampaignPlanningEstimationType;
import org.openapitools.model.CampaignPlanningPointEstimate;

@Canonical
class CampaignPlanningCurveEstimate {
    /* Estimation type for campaign planning estimated curve */
    CampaignPlanningEstimationType estimationType
    /* The estimation points that make up the estimated curve. */
    List<CampaignPlanningPointEstimate> points = new ArrayList<>()
}
