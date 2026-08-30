package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrderLine
import org.openapitools.server.api.model.OrderLineMutationError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrderLineMutationResult(
    /** Error list if update(s) fail. */
    val errors: kotlin.collections.List<OrderLineMutationError>? = null,
    /** Order Line object array. */
    val orderLine: kotlin.collections.List<OrderLine>? = null
)
