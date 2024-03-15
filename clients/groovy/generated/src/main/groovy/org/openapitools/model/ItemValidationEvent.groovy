package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ItemValidationEvent {
    /* The attribute that the item validation event references */
    String attribute
    /* The event code that the item validation event references */
    Integer code
    /* Title message describing the item validation event */
    String message
}
