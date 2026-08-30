package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BulkDownload(
    /** ID of the bulk request. */
    val requestId: kotlin.String? = null
)
