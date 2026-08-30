package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NullalbleMatchType;

@Canonical
class AdGroupDeliveryEstimatesKeywordsItems {
    
    NullalbleMatchType matchType
    /* Keyword value (120 chars max). */
    String value
}
