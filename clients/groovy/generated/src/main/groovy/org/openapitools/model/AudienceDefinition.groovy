package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AudienceDefinition {
    /* Generation date */
    String date
    /* Generated audience type to request. */
    String type
    /* Generated audience scope to request. */
    String scope
}
