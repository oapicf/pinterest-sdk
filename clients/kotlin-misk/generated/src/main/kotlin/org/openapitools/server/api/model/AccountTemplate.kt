package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionReportTimeType
import org.openapitools.server.api.model.CreationSource
import org.openapitools.server.api.model.DataOutputFormat
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.IngestionSource
import org.openapitools.server.api.model.MetricsReportingLevel
import org.openapitools.server.api.model.ReportingColumn
import org.openapitools.server.api.model.ReportingTimeZone
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AccountTemplate(
    /** Template ID */
    val id: kotlin.String,
    /** ID of the Ad Account that owns the template */
    val adAccountId: kotlin.String? = null,
    /** IDs of the Ad Accounts that have access to this template */
    val adAccountIds: kotlin.collections.List<kotlin.String>? = null,
    /** A list of ADE columns */
    val adeColumns: kotlin.collections.List<kotlin.String>? = null,
    /** Attribution type for Brand/Category/SKU reports */
    val attributionType: kotlin.Any? = null,
    /** The length of the sliding window over which click conversions will be attributed */
    val clickWindowDays: java.math.BigDecimal? = null,
    /** A list of columns to be included in the report */
    val columns: kotlin.collections.List<ReportingColumn>? = null,
    /** Conversion report time type */
    val conversionReportTimeType: ConversionReportTimeType? = null,
    /** The surface used to create this template */
    val creationSource: CreationSource? = null,
    /** A list of custom column IDs */
    val customColumnIds: kotlin.collections.List<kotlin.String>? = null,
    /** Additional metadata about this reporting template */
    val displayMetadata: kotlin.String? = null,
    /** The length of the sliding window over which engagement conversions will be attributed */
    val engagementWindowDays: java.math.BigDecimal? = null,
    /** A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values */
    val filtersJson: kotlin.String? = null,
    val granularity: Granularity? = null,
    /** The filter on the conversion ingestion source method for conversion metrics */
    val ingestionSources: kotlin.collections.List<IngestionSource>? = null,
    /** A boolean representing if this is the default view that loads for this template type */
    val isDefault: kotlin.Boolean? = null,
    /** A boolean that indicates if the template has been deleted */
    val isDeleted: kotlin.Boolean? = null,
    /** A boolean value that indicates if the user owns the template */
    val isOwnedByUser: kotlin.Boolean? = null,
    /** A boolean value that indicates if this template has been used to create a scheduled report */
    val isScheduled: kotlin.Boolean? = null,
    /** Template Name */
    val name: kotlin.String? = null,
    /** The number of days prior to the day the report will be delivered at which the report will end */
    val reportEndRelativeDaysInPast: java.math.BigDecimal? = null,
    val reportFormat: DataOutputFormat? = null,
    val reportLevel: MetricsReportingLevel? = null,
    /** The number of days prior to the day the report will be delivered at which the report will start */
    val reportStartRelativeDaysInPast: java.math.BigDecimal? = null,
    /** Timezone for reporting data */
    val reportingTimeZone: ReportingTimeZone? = null,
    /** Unified metric sort configuration */
    val sortBy: kotlin.Any? = null,
    /** Type of the template */
    val type: kotlin.String? = null,
    /** Time of last update in seconds since Unix epoch */
    val updatedTime: java.math.BigDecimal? = null,
    /** ID of the user who created the template */
    val userId: kotlin.String? = null,
    /** The length of the sliding window over which view conversions will be attributed */
    val viewWindowDays: java.math.BigDecimal? = null
)
