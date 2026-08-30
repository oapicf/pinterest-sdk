package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CartingRetailer {
    /* Unique identifier for the retailer */
    String retailerId
    /* Name of the retailer */
    String retailerName
}
