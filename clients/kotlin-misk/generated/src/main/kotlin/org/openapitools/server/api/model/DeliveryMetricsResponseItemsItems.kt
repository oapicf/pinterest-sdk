package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeliveryMetricsResponseItemsItems(
    /** Category name */
    val category: kotlin.String? = null,
    /** How the metric is defined. */
    val definition: kotlin.String? = null,
    /** Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. */
    val displayName: kotlin.String? = null,
    /** Metric&#39;s name. */
    val name: kotlin.String? = null
)
