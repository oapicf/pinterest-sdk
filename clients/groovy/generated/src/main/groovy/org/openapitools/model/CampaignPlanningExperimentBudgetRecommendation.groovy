package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CampaignPlanningBudgetRecommendationPoint;

@Canonical
class CampaignPlanningExperimentBudgetRecommendation {
    /* Recommended budget for this experiment version. */
    Integer budgetRecommendation
    /* Recommended lifetime days for this experiment. */
    Integer lifetimeDaysRecommendation
    /* Point estimations for this experiment version. */
    List<CampaignPlanningBudgetRecommendationPoint> pointEstimations = new ArrayList<>()
    /* Version identifier for the experiment. */
    String versionId
}
