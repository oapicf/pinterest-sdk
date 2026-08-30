@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AccountTemplate(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("ad_account_ids")
    val adAccountIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("ade_columns")
    val adeColumns: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("attribution_type")
    val attributionType: kotlin.Any? = null,

    @field:JsonProperty("click_window_days")
    val clickWindowDays: java.math.BigDecimal? = null,

    @field:JsonProperty("columns")
    val columns: kotlin.collections.List<ReportingColumn>? = null,

    @field:JsonProperty("conversion_report_time_type")
    val conversionReportTimeType: ConversionReportTimeType? = null,

    @field:JsonProperty("creation_source")
    val creationSource: CreationSource? = null,

    @field:JsonProperty("custom_column_ids")
    val customColumnIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("display_metadata")
    val displayMetadata: kotlin.String? = null,

    @field:JsonProperty("engagement_window_days")
    val engagementWindowDays: java.math.BigDecimal? = null,

    @field:JsonProperty("filters_json")
    val filtersJson: kotlin.String? = null,

    @field:JsonProperty("granularity")
    val granularity: Granularity? = null,

    @field:JsonProperty("ingestion_sources")
    val ingestionSources: kotlin.collections.List<IngestionSource>? = null,

    @field:JsonProperty("is_default")
    val isDefault: kotlin.Boolean? = null,

    @field:JsonProperty("is_deleted")
    val isDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("is_owned_by_user")
    val isOwnedByUser: kotlin.Boolean? = null,

    @field:JsonProperty("is_scheduled")
    val isScheduled: kotlin.Boolean? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("report_end_relative_days_in_past")
    val reportEndRelativeDaysInPast: java.math.BigDecimal? = null,

    @field:JsonProperty("report_format")
    val reportFormat: DataOutputFormat? = null,

    @field:JsonProperty("report_level")
    val reportLevel: MetricsReportingLevel? = null,

    @field:JsonProperty("report_start_relative_days_in_past")
    val reportStartRelativeDaysInPast: java.math.BigDecimal? = null,

    @field:JsonProperty("reporting_time_zone")
    val reportingTimeZone: ReportingTimeZone? = null,

    @field:JsonProperty("sort_by")
    val sortBy: kotlin.Any? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("updated_time")
    val updatedTime: java.math.BigDecimal? = null,

    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

    @field:JsonProperty("view_window_days")
    val viewWindowDays: java.math.BigDecimal? = null,

)
