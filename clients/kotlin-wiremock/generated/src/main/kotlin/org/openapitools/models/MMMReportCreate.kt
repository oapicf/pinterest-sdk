@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MMMReportCreate(
    @field:JsonProperty("columns")
    val columns: kotlin.collections.List<MMMReportingColumn>,

    @field:JsonProperty("end_date")
    val endDate: kotlin.String,

    @field:JsonProperty("granularity")
    val granularity: MMMReportGranularity,

    @field:JsonProperty("level")
    val level: MMMReportLevel,

    @field:JsonProperty("report_name")
    val reportName: kotlin.String,

    @field:JsonProperty("start_date")
    val startDate: kotlin.String,

    @field:JsonProperty("targeting_types")
    val targetingTypes: kotlin.collections.List<MMMReportingTargetingType>,

    @field:JsonProperty("advertiser_ids")
    val advertiserIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("countries")
    val countries: kotlin.collections.List<TargetingAdvertiserCountry>? = null,

    @field:JsonProperty("custom_column_ids")
    val customColumnIds: kotlin.collections.List<kotlin.String>? = null,

)
