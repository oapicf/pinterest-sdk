package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdAdsAnalyticsAsyncTargetingTypes
import org.openapitools.server.api.model.AdGroupSummaryStatus
import org.openapitools.server.api.model.AdsAnalyticsMetricsFilter
import org.openapitools.server.api.model.CampaignObjectiveType
import org.openapitools.server.api.model.CampaignSummaryStatus
import org.openapitools.server.api.model.ConversionAttributionWindowDays
import org.openapitools.server.api.model.ConversionReportAttributionType
import org.openapitools.server.api.model.ConversionReportTimeType
import org.openapitools.server.api.model.CustomConversionEventMetrics
import org.openapitools.server.api.model.DataOutputFormat
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.MetricsReportingLevel
import org.openapitools.server.api.model.PinPromotionSummaryStatus
import org.openapitools.server.api.model.PrimarySort
import org.openapitools.server.api.model.ProductGroupSummaryStatus
import org.openapitools.server.api.model.ReportingColumnAsync
import org.openapitools.server.api.model.ReportingTimeZone
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdsAnalyticsCreateAsyncRequest(
    /** Metric report end date (UTC). Format: YYYY-MM-DD */
    val endDate: kotlin.String,
    /**   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. */
    val granularity: Granularity,
    /** Metric report start date (UTC). Format: YYYY-MM-DD */
    val startDate: kotlin.String,
    /** List of ad group ids */
    val adGroupIds: kotlin.collections.List<kotlin.String>? = null,
    /** List of values for filtering */
    val adGroupStatuses: kotlin.collections.List<AdGroupSummaryStatus>? = null,
    /** List of ad ids. This parameter is not supported for Product Item level reports. */
    val adIds: kotlin.collections.List<kotlin.String>? = null,
    /** List of values for filtering. This parameter is not supported for Product Item level reports. */
    val adStatuses: kotlin.collections.List<PinPromotionSummaryStatus>? = null,
    /** List of attribution types for the conversion report. */
    val attributionTypes: kotlin.collections.List<ConversionReportAttributionType>? = null,
    /** Campaign brand label for filtering. */
    val campaignBrandLabel: kotlin.String? = null,
    /** Campaign custom label for filtering. */
    val campaignCustomLabel: kotlin.String? = null,
    /** List of campaign ids */
    val campaignIds: kotlin.collections.List<kotlin.String>? = null,
    /** List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. */
    val campaignObjectiveTypes: kotlin.collections.List<CampaignObjectiveType>? = null,
    /** List of status values for filtering */
    val campaignStatuses: kotlin.collections.List<CampaignSummaryStatus>? = null,
    /** Number of days to use as the conversion attribution window for a pin click action. */
    val clickWindowDays: ConversionAttributionWindowDays? = null,
    /** Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. */
    val columns: kotlin.collections.List<ReportingColumnAsync>? = null,
    /** Determines if the targeting types included in the request should be consolidated into a single breakdown. */
    val combineTargetingTypes: kotlin.Boolean? = false,
    /** Date dimension for conversion metrics. */
    val conversionReportTime: ConversionReportTimeType? = null,
    /** List of advertiser-defined custom conversion event metrics to include in the report */
    val customConversionEventMetrics: kotlin.collections.List<CustomConversionEventMetrics>? = null,
    /** Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. */
    val endHour: kotlin.Int? = null,
    /** Number of days to use as the conversion attribution window for an engagement action. */
    val engagementWindowDays: ConversionAttributionWindowDays? = null,
    /** Level of the report */
    val level: MetricsReportingLevel? = null,
    /** List of metrics filters */
    val metricsFilters: kotlin.collections.List<AdsAnalyticsMetricsFilter>? = null,
    val primarySort: PrimarySort? = null,
    /** List of product group ids */
    val productGroupIds: kotlin.collections.List<kotlin.String>? = null,
    /** List of values for filtering */
    val productGroupStatuses: kotlin.collections.List<ProductGroupSummaryStatus>? = null,
    /** List of product item ids */
    val productItemIds: kotlin.collections.List<kotlin.String>? = null,
    val reportFormat: DataOutputFormat? = null,
    /** Specify the timezone to be applied for the reporting. */
    val reportingTimezone: ReportingTimeZone? = null,
    /** Which hour of the start date to begin the report. Only allowed for hourly reports. */
    val startHour: kotlin.Int? = null,
    /** List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. */
    val targetingTypes: kotlin.collections.List<AdAdsAnalyticsAsyncTargetingTypes>? = null,
    /** Number of days to use as the conversion attribution window for a view action. */
    val viewWindowDays: ConversionAttributionWindowDays? = null
)
