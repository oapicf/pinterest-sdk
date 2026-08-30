package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BidOptionsAgeBucketMultipliers;
import org.openapitools.model.BidOptionsAppTypeMultipliers;
import org.openapitools.model.BidOptionsAudienceMultipliers;
import org.openapitools.model.BidOptionsGenderMultipliers;
import org.openapitools.model.BidOptionsPlacementMultipliers;

@Canonical
class ScheduleBidMultipliers {
    
    BidOptionsAgeBucketMultipliers ageBucketMultipliers
    
    BidOptionsAppTypeMultipliers appTypeMultipliers
    
    List<BidOptionsAudienceMultipliers> audienceMultipliers = new ArrayList<>()
    
    BidOptionsGenderMultipliers genderMultipliers
    
    BidOptionsPlacementMultipliers placementMultipliers
}
