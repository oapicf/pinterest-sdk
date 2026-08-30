package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MediaUploadParameters(
    val contentType: kotlin.String? = null,
    val key: kotlin.String? = null,
    val policy: kotlin.String? = null,
    val xAmzAlgorithm: kotlin.String? = null,
    val xAmzCredential: kotlin.String? = null,
    val xAmzDate: kotlin.String? = null,
    val xAmzSecurityToken: kotlin.String? = null,
    val xAmzSignature: kotlin.String? = null
)
