package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookClosed(
    /** Are conversion metrics ready? */
    val conversionMetricsReady: kotlin.Boolean,
    /** Are non-conversion metrics ready? */
    val nonConversionMetricsReady: kotlin.Boolean
)
