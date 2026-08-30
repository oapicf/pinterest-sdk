package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ScheduleAgeBucketMultipliers;
import org.openapitools.model.ScheduleAppTypeMultipliers;
import org.openapitools.model.ScheduleAudienceMultipliers;
import org.openapitools.model.ScheduleBidOptions;
import org.openapitools.model.ScheduleBidOptionsGenderMultipliers;
import org.openapitools.model.ScheduleBidOptionsPlacementMultipliers;

@Canonical
class ScheduleCommonDeltaValue {
    
    ScheduleAgeBucketMultipliers ageBucketMultipliers
    
    ScheduleAppTypeMultipliers appTypeMultipliers
    
    ScheduleAudienceMultipliers audienceMultipliers
    
    ScheduleBidOptionsGenderMultipliers genderMultipliers
    
    ScheduleBidOptionsPlacementMultipliers placementMultipliers
}
