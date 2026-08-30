package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class NotificationResponse {
    /* error message when success is false */
    String errorMsg
    /* Received time. Unix timestamp in seconds. */
    Integer receivedAt
    /* Returns true if the notification accepted. */
    Boolean success
}
