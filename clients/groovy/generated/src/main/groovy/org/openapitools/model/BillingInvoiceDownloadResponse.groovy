package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BillingInvoiceDownloadResponse {
    /* The download url for the billing invoice */
    String downloadUrl
    /* The billing invoice id */
    String id
}
