package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AdUpdateRequestAllOf1 {
    /* The ID of this ad. */
    String id
    /* Pin ID. This field may only be updated for draft ads. */
    String pinId
}
