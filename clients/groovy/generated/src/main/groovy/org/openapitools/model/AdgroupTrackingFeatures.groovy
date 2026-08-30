package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdgroupTrackingFeatureType;

@Canonical
class AdgroupTrackingFeatures {
    /* Tracking features. To clear this field, set to null. */
    List<AdgroupTrackingFeatureType> enabled = new ArrayList<>()
}
