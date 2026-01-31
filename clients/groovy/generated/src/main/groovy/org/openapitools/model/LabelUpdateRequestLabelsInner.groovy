package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LabelStatus;

@Canonical
class LabelUpdateRequestLabelsInner {
    /* Label ID. */
    String id
    
    LabelStatus status
    /* Label name. 100-character limit. */
    String value
}
