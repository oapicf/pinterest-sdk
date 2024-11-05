package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AdAccountCreateSubscriptionResponse {
    /* Subscription ID. */
    String id
    /* Base64 encoded key for client to decrypt lead data. */
    String cryptographicKey
    /* Lead data encryption algorithm. */
    String cryptographicAlgorithm
    /* Subscription creation time. Unix timestamp in milliseconds. */
    Integer createdTime
}
