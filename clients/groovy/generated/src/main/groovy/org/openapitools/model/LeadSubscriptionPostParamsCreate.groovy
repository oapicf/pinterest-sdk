package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LeadSubscriptionPostParamsCreateAllOfPartnerMetadata;

@Canonical
class LeadSubscriptionPostParamsCreate {
    /* Lead form ID. */
    String leadFormId
    /* Standard HTTPS webhook URL. */
    String webhookUrl
    /* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
    String partnerAccessToken
    
    LeadSubscriptionPostParamsCreateAllOfPartnerMetadata partnerMetadata
    /* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
    String partnerRefreshToken
}
