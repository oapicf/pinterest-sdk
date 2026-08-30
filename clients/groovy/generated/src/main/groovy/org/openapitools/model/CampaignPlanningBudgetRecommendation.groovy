package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CampaignPlanningBudgetRecommendationPoint;
import org.openapitools.model.CampaignPlanningExperimentBudgetRecommendation;

@Canonical
class CampaignPlanningBudgetRecommendation {
    /* The recommended budget amount. */
    Integer budgetRecommendation
    /* List of experimental budget recommendations. */
    List<CampaignPlanningExperimentBudgetRecommendation> experimentCampaignBudgetRecommendation = new ArrayList<>()
    /* Recommended number of days for the campaign lifetime. */
    Integer lifetimeDaysRecommendation
    /* List of point estimations for different budget scenarios. */
    List<CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>()
}
