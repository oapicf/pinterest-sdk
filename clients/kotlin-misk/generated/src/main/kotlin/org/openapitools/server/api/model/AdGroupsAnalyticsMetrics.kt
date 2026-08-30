package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdGroupsAnalyticsMetrics(
    /** The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true. */
    val AD_GROUP_ID: kotlin.String? = null,
    /** Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) */
    val DATE: java.time.LocalDate? = null
)
