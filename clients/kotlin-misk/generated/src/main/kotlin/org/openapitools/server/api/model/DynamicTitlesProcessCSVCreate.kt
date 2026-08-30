package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DynamicTitlesProcessCSVCreate(
    /** The request_id returned from the GET uploads endpoint. */
    val requestId: kotlin.String
)
