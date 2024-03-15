package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MatchTypeResponse;

@Canonical
class AdGroupAudienceSizingRequestKeywordsInner {
    
    MatchTypeResponse matchType
    /* Keyword value (120 chars max). */
    String value
}
