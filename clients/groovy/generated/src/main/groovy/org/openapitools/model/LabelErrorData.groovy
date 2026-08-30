package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NullableLabelStatus;
import org.openapitools.model.NullableLabelType;

@Canonical
class LabelErrorData {
    /* Label ID. */
    String id
    
    NullableLabelType labelType
    
    NullableLabelStatus status
    /* Label name. 100-character limit. */
    String value
}
