package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PartnerMetadata;

@Canonical
class LeadSubscriptionPostParams {
    /* The Ad Account ID that this lead form belongs to. */
    String adAccountId
    /* API version. */
    String apiVersion
    /* Subscription creation time. Unix timestamp in milliseconds. */
    Integer createdTime
    /* Lead data encryption algorithm. */
    String cryptographicAlgorithm
    /* Base64 encoded key for client to decrypt lead data. */
    String cryptographicKey
    /* Subscription ID. */
    String id
    /* Lead form ID. */
    String leadFormId
    /* User account used to subscribe lead data. */
    String userAccountId
    /* Standard HTTPS webhook URL. */
    String webhookUrl
    /* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
    String partnerAccessToken
    /* Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. */
    PartnerMetadata partnerMetadata
    /* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
    String partnerRefreshToken
}
