package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CampaignDeliveryEstimatesDerivedMetrics;
import org.openapitools.model.CampaignPlanningAdGroupAudienceSize;
import org.openapitools.model.CampaignPlanningConversionRate;
import org.openapitools.model.CampaignPlanningCurveEstimate;
import org.openapitools.model.CampaignPlanningResponseError;

@Canonical
class BulkCampaignDeliveryEstimatesItem {
    /* Range audience sizes for each ad group, in the same order as the ad groups in the request. */
    List<CampaignPlanningAdGroupAudienceSize> adgroupAudienceSizes = new ArrayList<>()
    /* Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. */
    Float conversionRate
    /* Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. */
    List<CampaignPlanningConversionRate> conversionRates = new ArrayList<>()
    /* Estimated curves. Each curve will pertain to a single estimation type. */
    List<CampaignPlanningCurveEstimate> curves = new ArrayList<>()
    
    CampaignDeliveryEstimatesDerivedMetrics derivedMetrics
    /* Errors encountered during estimation for this campaign. */
    List<CampaignPlanningResponseError> errors = new ArrayList<>()
    /* UUID used to track delivery estimates when they are generated as part of a saved campaign. */
    String estimateId
    /* Maximum potential spend estimate. */
    Integer maxPotentialSpend
}
