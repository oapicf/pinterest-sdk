package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class IntegrationLogsInvalidLogResponseRejectedLogsItems {
    /* The field name containing an invalid value. */
    String field
    /* Index of the log in the batch. */
    Integer logIndex
    /* The reason the value is invalid. */
    String reason
    /* The value that is invalid. */
    String value
}
