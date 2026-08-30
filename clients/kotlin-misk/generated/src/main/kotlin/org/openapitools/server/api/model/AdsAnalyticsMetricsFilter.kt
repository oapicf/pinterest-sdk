package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdsAnalyticsFilterColumn
import org.openapitools.server.api.model.AdsAnalyticsFilterOperator
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdsAnalyticsMetricsFilter(
    val `field`: AdsAnalyticsFilterColumn,
    val `operator`: AdsAnalyticsFilterOperator,
    /** List of values for filtering */
    val propertyValues: kotlin.collections.List<java.math.BigDecimal>
)
