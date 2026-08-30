package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.model.CampaignPlanningCurveEstimate;

@Canonical
class CampaignDeliveryEstimatesResponse {
    /* Estimated curves. Each curve will pertain to a single estimation type. */
    List<CampaignPlanningCurveEstimate> curves = new ArrayList<>()
    
    CampaignDeliveryEstimatesDerivedMetrics derivedMetrics
    /* Maximum potential spend estimate. */
    Integer maxPotentialSpend
}
