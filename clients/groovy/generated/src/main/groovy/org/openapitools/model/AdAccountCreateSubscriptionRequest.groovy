package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdAccountCreateSubscriptionRequestPartnerMetadata;

@Canonical
class AdAccountCreateSubscriptionRequest {
    /* Lead form ID. */
    String leadFormId
    /* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
    String partnerAccessToken
    
    AdAccountCreateSubscriptionRequestPartnerMetadata partnerMetadata
    /* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
    String partnerRefreshToken
    /* Standard HTTPS webhook URL. */
    String webhookUrl
}
