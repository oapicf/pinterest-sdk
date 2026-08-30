package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PartnerMetadata;

@Canonical
class LeadSubscriptionPostParamsCreate {
    /* Lead form ID. */
    String leadFormId
    /* Standard HTTPS webhook URL. */
    String webhookUrl
    /* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
    String partnerAccessToken
    /* Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. */
    PartnerMetadata partnerMetadata
    /* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
    String partnerRefreshToken
}
