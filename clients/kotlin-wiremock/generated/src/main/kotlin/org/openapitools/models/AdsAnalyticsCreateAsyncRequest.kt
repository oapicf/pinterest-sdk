@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdsAnalyticsCreateAsyncRequest(
    @field:JsonProperty("end_date")
    val endDate: kotlin.String,

    @field:JsonProperty("granularity")
    val granularity: Granularity,

    @field:JsonProperty("start_date")
    val startDate: kotlin.String,

    @field:JsonProperty("ad_group_ids")
    val adGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("ad_group_statuses")
    val adGroupStatuses: kotlin.collections.List<AdGroupSummaryStatus>? = null,

    @field:JsonProperty("ad_ids")
    val adIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("ad_statuses")
    val adStatuses: kotlin.collections.List<PinPromotionSummaryStatus>? = null,

    @field:JsonProperty("attribution_types")
    val attributionTypes: kotlin.collections.List<ConversionReportAttributionType>? = null,

    @field:JsonProperty("campaign_brand_label")
    val campaignBrandLabel: kotlin.String? = null,

    @field:JsonProperty("campaign_custom_label")
    val campaignCustomLabel: kotlin.String? = null,

    @field:JsonProperty("campaign_ids")
    val campaignIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("campaign_objective_types")
    val campaignObjectiveTypes: kotlin.collections.List<CampaignObjectiveType>? = null,

    @field:JsonProperty("campaign_statuses")
    val campaignStatuses: kotlin.collections.List<CampaignSummaryStatus>? = null,

    @field:JsonProperty("click_window_days")
    val clickWindowDays: ConversionAttributionWindowDays? = null,

    @field:JsonProperty("columns")
    val columns: kotlin.collections.List<ReportingColumnAsync>? = null,

    @field:JsonProperty("combine_targeting_types")
    val combineTargetingTypes: kotlin.Boolean? = false,

    @field:JsonProperty("conversion_report_time")
    val conversionReportTime: ConversionReportTimeType? = null,

    @field:JsonProperty("custom_conversion_event_metrics")
    val customConversionEventMetrics: kotlin.collections.List<CustomConversionEventMetrics>? = null,

    @field:JsonProperty("end_hour")
    val endHour: kotlin.Int? = null,

    @field:JsonProperty("engagement_window_days")
    val engagementWindowDays: ConversionAttributionWindowDays? = null,

    @field:JsonProperty("level")
    val level: MetricsReportingLevel? = null,

    @field:JsonProperty("metrics_filters")
    val metricsFilters: kotlin.collections.List<AdsAnalyticsMetricsFilter>? = null,

    @field:JsonProperty("primary_sort")
    val primarySort: PrimarySort? = null,

    @field:JsonProperty("product_group_ids")
    val productGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("product_group_statuses")
    val productGroupStatuses: kotlin.collections.List<ProductGroupSummaryStatus>? = null,

    @field:JsonProperty("product_item_ids")
    val productItemIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("report_format")
    val reportFormat: DataOutputFormat? = null,

    @field:JsonProperty("reporting_timezone")
    val reportingTimezone: ReportingTimeZone? = null,

    @field:JsonProperty("start_hour")
    val startHour: kotlin.Int? = null,

    @field:JsonProperty("targeting_types")
    val targetingTypes: kotlin.collections.List<AdAdsAnalyticsAsyncTargetingTypes>? = null,

    @field:JsonProperty("view_window_days")
    val viewWindowDays: ConversionAttributionWindowDays? = null,

)
