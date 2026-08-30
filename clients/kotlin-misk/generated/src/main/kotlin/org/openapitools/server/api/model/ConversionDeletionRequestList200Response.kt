package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionDeletionRequest
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionDeletionRequestList200Response(
    val items: kotlin.collections.List<ConversionDeletionRequest>,
    val bookmark: kotlin.String? = null
)
