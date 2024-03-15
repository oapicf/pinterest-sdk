package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceRule;

@Canonical
class AudienceCommon {
    /* Ad account ID. */
    String adAccountId
    /* Audience name. */
    String name
    
    AudienceRule rule
}
