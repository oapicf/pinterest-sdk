package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class SSIOInsertionOrderStatusResponse {
    /* Salesforce order id */
    String pinOrderId
    /* Salesforce insertion order status */
    String status
    /* Salesforce insertion order creation time */
    String creationTime
}
