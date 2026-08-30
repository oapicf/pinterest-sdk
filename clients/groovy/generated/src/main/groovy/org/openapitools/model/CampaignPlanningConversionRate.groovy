package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningConversionAttribution;
import org.openapitools.model.CampaignPlanningConversionEvent;

@Canonical
class CampaignPlanningConversionRate {
    
    CampaignPlanningConversionAttribution attributionWindows
    
    CampaignPlanningConversionEvent conversionEvent
    /* Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. */
    Float conversionRate
}
