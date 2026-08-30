package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdPinAnalytics(
    /** The ID of the pin that the metric belongs to. */
    val PIN_ID: kotlin.String,
    /** Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) */
    val DATE: java.time.LocalDate? = null
)
