package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Exception {
    /* Exception error code. */
    Integer code
    /* Exception message. */
    String message
}
