package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrderLine
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrderLineMutationError(
    val `data`: OrderLine? = null,
    /** Error messages. */
    val errorMessages: kotlin.collections.List<kotlin.String>? = null
)
