package org.openapitools.server.api.model

import org.openapitools.server.api.model.MMMReportGranularity
import org.openapitools.server.api.model.MMMReportLevel
import org.openapitools.server.api.model.MMMReportingColumn
import org.openapitools.server.api.model.MMMReportingTargetingType
import org.openapitools.server.api.model.TargetingAdvertiserCountry
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MMMReportCreate(
    /** Metric and entity columns */
    val columns: kotlin.collections.List<MMMReportingColumn>,
    /** Metric report end date (UTC). Format: YYYY-MM-DD */
    val endDate: kotlin.String,
    /**   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. */
    val granularity: MMMReportGranularity,
    /** Level of the report */
    val level: MMMReportLevel,
    /** Name of the Marketing Mix Modeling (MMM) report */
    val reportName: kotlin.String,
    /** Metric report start date (UTC). Format: YYYY-MM-DD */
    val startDate: kotlin.String,
    /** List of targeting types */
    val targetingTypes: kotlin.collections.List<MMMReportingTargetingType>,
    /** Advertiser IDs for multi-advertiser report */
    val advertiserIds: kotlin.collections.List<kotlin.String>? = null,
    /** A List of countries for filtering */
    val countries: kotlin.collections.List<TargetingAdvertiserCountry>? = null,
    /** List of custom column IDs */
    val customColumnIds: kotlin.collections.List<kotlin.String>? = null
)
