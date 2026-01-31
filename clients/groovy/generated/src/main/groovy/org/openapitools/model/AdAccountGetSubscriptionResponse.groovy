package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AdAccountGetSubscriptionResponse {
    /* Lead form ID. */
    String leadFormId
    /* Standard HTTPS webhook URL. */
    String webhookUrl
    /* The Ad Account ID that this lead form belongs to. */
    String adAccountId
    /* API version. */
    String apiVersion
    /* Lead subscription creation time. Unix timestamp in milliseconds. */
    Integer createdTime
    /* Lead data encryption algorithm. */
    String cryptographicAlgorithm
    /* Base64 encoded key for client to decrypt lead data. */
    String cryptographicKey
    /* Subscription ID. */
    String id
    /* User account used to subscribe lead data. */
    String userAccountId
}
