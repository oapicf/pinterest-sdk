package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UserWebsiteSummary {
    /* Website with path or domain only */
    String website
    /* Status of the verification process */
    String status
    /* UTC timestamp when the verification happened - sometimes missing */
    String verifiedAt
}
