package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceRule;
import org.openapitools.model.AudienceUpdateOperationType;

@Canonical
class AudienceUpdateRequest {
    /* Ad account ID. */
    String adAccountId
    /* Audience name. */
    String name
    
    AudienceRule rule
    /* Audience description. */
    String description
    
    AudienceUpdateOperationType operationType = AudienceUpdateOperationType.UPDATE
}
