package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MatchType;

@Canonical
class TargetingTemplateKeyword {
    
    MatchType matchType
    /* The keyword targeting (120 chars max). */
    String value
}
