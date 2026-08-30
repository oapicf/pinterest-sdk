package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DynamicTitlesProcessCSVError {
    /* The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. */
    String errorType
    /* The row number with a validation error. -1 indicates a file-level error. */
    Integer rowNumber
}
