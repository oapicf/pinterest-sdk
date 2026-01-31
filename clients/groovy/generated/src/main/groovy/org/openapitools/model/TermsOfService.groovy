package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class TermsOfService {
    /* The ID of the ad account. */
    String adAccountId
    /* Whether the ad account has accepted terms of service. */
    Boolean hasAccepted
    /* The terms of service content */
    String html
    /* The ID of the terms of service */
    String id
}
