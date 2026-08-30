package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AgeBucketMultipliers;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.CampaignAudienceMultipliers;
import org.openapitools.model.FreqBidMultiplierTimeWindow;
import org.openapitools.model.FrequencyMultipliers;
import org.openapitools.model.GenderMultipliers;
import org.openapitools.model.PlacementMultipliers;

@Canonical
class CampaignBidOptions {
    /* Age bucket multipliers for bid adjustments. */
    AgeBucketMultipliers ageBucketMultipliers
    /* App type multipliers for bid adjustments. */
    AppTypeMultipliers appTypeMultipliers
    /* Audience multipliers for bid adjustments. */
    CampaignAudienceMultipliers audienceMultipliers
    /* The time window for frequency bid multipliers. */
    FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow
    /* Frequency multipliers for bid adjustments. */
    FrequencyMultipliers frequencyMultipliers
    /* Gender multipliers for bid adjustments. */
    GenderMultipliers genderMultipliers
    /* Placement multipliers for bid adjustments. */
    PlacementMultipliers placementMultipliers
}
