package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ErrorDetail {
    /* Number of records with this error */
    Integer count
    /* Numeric error code */
    Integer errorCode
    /* Error message description */
    String message
}
