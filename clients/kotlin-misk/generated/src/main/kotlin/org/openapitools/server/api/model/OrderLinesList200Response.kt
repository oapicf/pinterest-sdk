package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrderLine
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrderLinesList200Response(
    val items: kotlin.collections.List<OrderLine>,
    val bookmark: kotlin.String? = null
)
