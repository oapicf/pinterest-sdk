package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceCreateRequest1AudienceType;
import org.openapitools.model.AudienceRule;

@Canonical
class AudienceCreateRequest {
    /* Ad account ID. */
    String adAccountId
    /* Audience name. */
    String name
    
    AudienceRule rule
    /* Audience description. */
    String description
    
    AudienceCreateRequest1AudienceType audienceType
}
