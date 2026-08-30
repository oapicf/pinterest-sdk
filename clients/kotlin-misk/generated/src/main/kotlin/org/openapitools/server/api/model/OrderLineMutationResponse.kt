package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrderLineMutationResult
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrderLineMutationResponse(
    val `data`: OrderLineMutationResult? = null
)
