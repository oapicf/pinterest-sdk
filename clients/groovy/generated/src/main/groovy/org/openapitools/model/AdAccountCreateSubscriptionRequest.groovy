package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AdAccountCreateSubscriptionRequest {
    /* Standard HTTPS webhook URL. */
    String webhookUrl
    /* Lead form ID. */
    String leadFormId
    /* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
    String partnerAccessToken
    /* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
    String partnerRefreshToken
}
