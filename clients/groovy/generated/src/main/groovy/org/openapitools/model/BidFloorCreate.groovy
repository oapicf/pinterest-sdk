package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BidFloorSpec;
import org.openapitools.model.TargetingSpecOptimal;

@Canonical
class BidFloorCreate {
    /* List of bid floor specifications. */
    List<BidFloorSpec> bidFloorSpecs = new ArrayList<>()
    /* Ad group targeting specification defining the ad group target audience. */
    TargetingSpecOptimal targetingSpec
}
