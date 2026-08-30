package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConversionReportTimeType
import org.openapitools.model.CreationSource
import org.openapitools.model.DataOutputFormat
import org.openapitools.model.Granularity
import org.openapitools.model.IngestionSource
import org.openapitools.model.MetricsReportingLevel
import org.openapitools.model.ReportingColumn
import org.openapitools.model.ReportingTimeZone
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id Template ID
 * @param adAccountId ID of the Ad Account that owns the template
 * @param adAccountIds IDs of the Ad Accounts that have access to this template
 * @param adeColumns A list of ADE columns
 * @param attributionType Attribution type for Brand/Category/SKU reports
 * @param clickWindowDays The length of the sliding window over which click conversions will be attributed
 * @param columns A list of columns to be included in the report
 * @param conversionReportTimeType Conversion report time type
 * @param creationSource The surface used to create this template
 * @param customColumnIds A list of custom column IDs
 * @param displayMetadata Additional metadata about this reporting template
 * @param engagementWindowDays The length of the sliding window over which engagement conversions will be attributed
 * @param filtersJson A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
 * @param granularity 
 * @param ingestionSources The filter on the conversion ingestion source method for conversion metrics
 * @param isDefault A boolean representing if this is the default view that loads for this template type
 * @param isDeleted A boolean that indicates if the template has been deleted
 * @param isOwnedByUser A boolean value that indicates if the user owns the template
 * @param isScheduled A boolean value that indicates if this template has been used to create a scheduled report
 * @param name Template Name
 * @param reportEndRelativeDaysInPast The number of days prior to the day the report will be delivered at which the report will end
 * @param reportFormat 
 * @param reportLevel 
 * @param reportStartRelativeDaysInPast The number of days prior to the day the report will be delivered at which the report will start
 * @param reportingTimeZone Timezone for reporting data
 * @param sortBy Unified metric sort configuration
 * @param type Type of the template
 * @param updatedTime Time of last update in seconds since Unix epoch
 * @param userId ID of the user who created the template
 * @param viewWindowDays The length of the sliding window over which view conversions will be attributed
 */
data class AccountTemplate(

    @Schema(required = true, readOnly = true, description = "Template ID")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(readOnly = true, description = "ID of the Ad Account that owns the template")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(description = "IDs of the Ad Accounts that have access to this template")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_ids")
    @get:JsonProperty("ad_account_ids") val adAccountIds: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "[\"ADE_COST_PER_ACTION-download_picture\"]", description = "A list of ADE columns")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ade_columns")
    @get:JsonProperty("ade_columns") val adeColumns: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "ADVERTISER_LEVEL", description = "Attribution type for Brand/Category/SKU reports")
    @param:JsonProperty("attribution_type")
    @get:JsonProperty("attribution_type") val attributionType: kotlin.Any? = null,

    @Schema(description = "The length of the sliding window over which click conversions will be attributed")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("click_window_days")
    @get:JsonProperty("click_window_days") val clickWindowDays: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(description = "A list of columns to be included in the report")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("columns")
    @get:JsonProperty("columns") val columns: kotlin.collections.List<ReportingColumn>? = null,

    @field:Valid
    @Schema(description = "Conversion report time type")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_report_time_type")
    @get:JsonProperty("conversion_report_time_type") val conversionReportTimeType: ConversionReportTimeType? = null,

    @field:Valid
    @Schema(description = "The surface used to create this template")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("creation_source")
    @get:JsonProperty("creation_source") val creationSource: CreationSource? = null,

    @Schema(description = "A list of custom column IDs")
    @param:JsonProperty("custom_column_ids")
    @get:JsonProperty("custom_column_ids") val customColumnIds: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "Additional metadata about this reporting template")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("display_metadata")
    @get:JsonProperty("display_metadata") val displayMetadata: kotlin.String? = null,

    @Schema(description = "The length of the sliding window over which engagement conversions will be attributed")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("engagement_window_days")
    @get:JsonProperty("engagement_window_days") val engagementWindowDays: java.math.BigDecimal? = null,

    @Schema(description = "A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values")
    @param:JsonProperty("filters_json")
    @get:JsonProperty("filters_json") val filtersJson: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("granularity")
    @get:JsonProperty("granularity") val granularity: Granularity? = null,

    @field:Valid
    @Schema(description = "The filter on the conversion ingestion source method for conversion metrics")
    @param:JsonProperty("ingestion_sources")
    @get:JsonProperty("ingestion_sources") val ingestionSources: kotlin.collections.List<IngestionSource>? = null,

    @Schema(example = "false", description = "A boolean representing if this is the default view that loads for this template type")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_default")
    @get:JsonProperty("is_default") val isDefault: kotlin.Boolean? = null,

    @Schema(description = "A boolean that indicates if the template has been deleted")
    @param:JsonProperty("is_deleted")
    @get:JsonProperty("is_deleted") val isDeleted: kotlin.Boolean? = null,

    @Schema(description = "A boolean value that indicates if the user owns the template")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_owned_by_user")
    @get:JsonProperty("is_owned_by_user") val isOwnedByUser: kotlin.Boolean? = null,

    @Schema(description = "A boolean value that indicates if this template has been used to create a scheduled report")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_scheduled")
    @get:JsonProperty("is_scheduled") val isScheduled: kotlin.Boolean? = null,

    @Schema(description = "Template Name")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(description = "The number of days prior to the day the report will be delivered at which the report will end")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("report_end_relative_days_in_past")
    @get:JsonProperty("report_end_relative_days_in_past") val reportEndRelativeDaysInPast: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("report_format")
    @get:JsonProperty("report_format") val reportFormat: DataOutputFormat? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("report_level")
    @get:JsonProperty("report_level") val reportLevel: MetricsReportingLevel? = null,

    @Schema(description = "The number of days prior to the day the report will be delivered at which the report will start")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("report_start_relative_days_in_past")
    @get:JsonProperty("report_start_relative_days_in_past") val reportStartRelativeDaysInPast: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(description = "Timezone for reporting data")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("reporting_time_zone")
    @get:JsonProperty("reporting_time_zone") val reportingTimeZone: ReportingTimeZone? = null,

    @field:Valid
    @Schema(description = "Unified metric sort configuration")
    @param:JsonProperty("sort_by")
    @get:JsonProperty("sort_by") val sortBy: kotlin.Any? = null,

    @Schema(description = "Type of the template")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(readOnly = true, description = "Time of last update in seconds since Unix epoch")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("updated_time")
    @get:JsonProperty("updated_time") val updatedTime: java.math.BigDecimal? = null,

    @Schema(description = "ID of the user who created the template")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user_id")
    @get:JsonProperty("user_id") val userId: kotlin.String? = null,

    @Schema(description = "The length of the sliding window over which view conversions will be attributed")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("view_window_days")
    @get:JsonProperty("view_window_days") val viewWindowDays: java.math.BigDecimal? = null
) {

}

