package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductGroupAnalyticsItems(
    /** The ID of the product group that this metrics belongs to. */
    val PRODUCT_GROUP_ID: kotlin.String,
    /** Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) */
    val DATE: java.time.LocalDate? = null
)
