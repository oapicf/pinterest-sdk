package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AmazonConnectResponse(
    /** Amazon connect response message */
    val message: kotlin.String? = null
)
