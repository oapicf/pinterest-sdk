package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AudienceUpdateOperationType;
import org.openapitools.model.TargetingSpecOptimal;

@Canonical
class TargetingTemplateUpdateRequestReadOrUpdate {
    /* Targeting template ID */
    String id
    
    AudienceUpdateOperationType operationType
    /* targeting profile attributes */
    TargetingSpecOptimal targetingAttributes
}
