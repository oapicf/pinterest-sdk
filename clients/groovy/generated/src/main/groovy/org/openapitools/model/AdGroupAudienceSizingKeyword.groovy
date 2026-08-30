package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MatchType;

@Canonical
class AdGroupAudienceSizingKeyword {
    
    MatchType matchType
    /* Keyword value (120 chars max). */
    String value
}
