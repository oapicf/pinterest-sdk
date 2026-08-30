package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SupplementalItemValidationEvent {
    /* The item attribute referenced by the validation event eg. price, availability, ad_link */
    String attribute
    /* The event code that the item validation event references */
    Integer code
    /* Title message describing the item validation event */
    String message
}
