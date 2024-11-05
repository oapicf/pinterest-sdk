package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AdvancedAuctionOperationError {
    /* The error code for the item bid option operation validation error */
    Integer code
    /* Message describing the item bid option operation validation error */
    String message
}
