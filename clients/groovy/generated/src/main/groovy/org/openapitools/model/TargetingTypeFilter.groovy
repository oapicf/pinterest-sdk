package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AdsAnalyticsTargetingType;

@Canonical
class TargetingTypeFilter {
    /* List of targeting types */
    List<AdsAnalyticsTargetingType> targetingTypes = new ArrayList<AdsAnalyticsTargetingType>()
}
