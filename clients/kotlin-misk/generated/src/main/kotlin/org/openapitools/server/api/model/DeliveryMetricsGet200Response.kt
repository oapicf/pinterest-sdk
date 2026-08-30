package org.openapitools.server.api.model

import org.openapitools.server.api.model.DeliveryMetricsResponseItemsItems
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeliveryMetricsGet200Response(
    val items: kotlin.collections.List<DeliveryMetricsResponseItemsItems>
)
