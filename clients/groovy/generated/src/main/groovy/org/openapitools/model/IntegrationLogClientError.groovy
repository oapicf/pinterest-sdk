package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class IntegrationLogClientError {
    /* Original cause of the error. */
    String cause
    /* Column number in the line of the file that raised the error. */
    Integer columnNumber
    /* Filename where the error happened. */
    String fileName
    /* Line number where the error happened. */
    Integer lineNumber
    /* Human-readable description of the error. */
    String message
    /* More detail about the message. */
    String messageDetail
    /* Filename where the error happened. */
    String name
    /* Integer that specifies the error code. */
    Integer number
    /* Stack trace of where the error happened. */
    String stackTrace
}
