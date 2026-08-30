package org.openapitools.server.api.model

import org.openapitools.server.api.model.TrendingPin
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrendingTopic(
    /** Description of the trending topic */
    val description: kotlin.String,
    /** Unique identifier for the trending topic */
    val id: kotlin.String,
    /** Array of pin images related to this trend (up to 6) */
    val pins: kotlin.collections.List<TrendingPin>,
    /** List of related interest categories */
    val relatedInterests: kotlin.collections.List<kotlin.String>,
    /** List of related search terms */
    val relatedSearches: kotlin.collections.List<kotlin.String>,
    /** Time series data showing trend values over time, with dates as keys and values as numeric */
    val timeSeries: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>,
    /** Title of the trending topic */
    val title: kotlin.String,
    /** Month-over-month growth percentage */
    val percentGrowthMom: kotlin.Int? = null
)
