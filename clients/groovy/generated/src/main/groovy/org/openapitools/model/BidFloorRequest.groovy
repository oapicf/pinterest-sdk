package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BidFloorSpec;
import org.openapitools.model.TargetingSpec;

@Canonical
class BidFloorRequest {
    
    List<BidFloorSpec> bidFloorSpecs = new ArrayList<>()
    
    TargetingSpec targetingSpec
}
