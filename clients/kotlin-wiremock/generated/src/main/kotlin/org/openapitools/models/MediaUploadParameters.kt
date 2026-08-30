@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MediaUploadParameters(
    @field:JsonProperty("Content-Type")
    val contentType: kotlin.String? = null,

    @field:JsonProperty("key")
    val key: kotlin.String? = null,

    @field:JsonProperty("policy")
    val policy: kotlin.String? = null,

    @field:JsonProperty("x-amz-algorithm")
    val xAmzAlgorithm: kotlin.String? = null,

    @field:JsonProperty("x-amz-credential")
    val xAmzCredential: kotlin.String? = null,

    @field:JsonProperty("x-amz-date")
    val xAmzDate: kotlin.String? = null,

    @field:JsonProperty("x-amz-security-token")
    val xAmzSecurityToken: kotlin.String? = null,

    @field:JsonProperty("x-amz-signature")
    val xAmzSignature: kotlin.String? = null,

)
