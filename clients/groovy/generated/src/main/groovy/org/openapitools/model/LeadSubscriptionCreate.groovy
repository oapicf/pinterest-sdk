package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class LeadSubscriptionCreate {
    /* Lead form ID. */
    String leadFormId
    /* Standard HTTPS webhook URL. */
    String webhookUrl
}
