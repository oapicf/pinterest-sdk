package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningConversionAttributionWindowDays;

@Canonical
class CampaignPlanningConversionAttribution {
    /* Number of days to use as the conversion attribution window for a pin click action. */
    CampaignPlanningConversionAttributionWindowDays clickWindowDays
    /* Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. */
    CampaignPlanningConversionAttributionWindowDays engagementWindowDays
    /* Number of days to use as the conversion attribution window for a view action. */
    CampaignPlanningConversionAttributionWindowDays viewWindowDays
}
