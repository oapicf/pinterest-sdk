package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EntityLabelStatus;
import org.openapitools.model.LabelParentType;

@Canonical
class EntityLabel {
    /* Entity ID to apply label to. */
    String entityId
    
    LabelParentType entityType
    /* Label ID. */
    String labelId
    
    EntityLabelStatus status
}
