package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BulkUpsertResponse(
    val requestId: kotlin.String? = null
)
