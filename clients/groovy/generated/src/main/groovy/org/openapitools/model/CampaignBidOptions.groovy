package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.CampaignAudienceMultipliers;
import org.openapitools.model.PlacementMultipliers;

@Canonical
class CampaignBidOptions {
    
    AppTypeMultipliers appTypeMultipliers
    
    CampaignAudienceMultipliers audienceMultipliers
    
    PlacementMultipliers placementMultipliers
}
