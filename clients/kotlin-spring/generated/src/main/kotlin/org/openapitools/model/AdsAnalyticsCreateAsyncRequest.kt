package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdGroupSummaryStatus
import org.openapitools.model.AdsAnalyticsCreateAsyncRequestAllOf
import org.openapitools.model.AdsAnalyticsCreateAsyncRequestAllOf1
import org.openapitools.model.AdsAnalyticsMetricsFilter
import org.openapitools.model.AdsAnalyticsTargetingType
import org.openapitools.model.CampaignSummaryStatus
import org.openapitools.model.ConversionAttributionWindowDays
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.ConversionReportTimeType
import org.openapitools.model.DataOutputFormat
import org.openapitools.model.Granularity
import org.openapitools.model.MetricsReportingLevel
import org.openapitools.model.ObjectiveType
import org.openapitools.model.PinPromotionSummaryStatus
import org.openapitools.model.ProductGroupSummaryStatus
import org.openapitools.model.ReportingColumnAsync
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
 * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
 * @param columns Metric and entity columns
 * @param level Level of the report
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * @param attributionTypes List of types of attribution for the conversion report
 * @param reportFormat Specification for formatting report data
 * @param campaignIds List of campaign ids
 * @param campaignStatuses List of status values for filtering
 * @param campaignObjectiveTypes List of values for filtering
 * @param adGroupIds List of ad group ids
 * @param adGroupStatuses List of values for filtering
 * @param adIds List of ad ids
 * @param adStatuses List of values for filtering
 * @param productGroupIds List of product group ids
 * @param productGroupStatuses List of values for filtering
 * @param productItemIds List of product item ids
 * @param targetingTypes List of targeting types
 * @param metricsFilters List of metrics filters
 */
data class AdsAnalyticsCreateAsyncRequest(
    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @field:JsonProperty("start_date", required = true) val startDate: kotlin.String,
    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @field:JsonProperty("end_date", required = true) val endDate: kotlin.String,

    @field:Valid
    @field:JsonProperty("granularity", required = true) val granularity: Granularity,

    @field:Valid
    @field:JsonProperty("columns", required = true) val columns: kotlin.collections.List<ReportingColumnAsync>,

    @field:Valid
    @field:JsonProperty("level", required = true) val level: MetricsReportingLevel,

    @field:Valid
    @field:JsonProperty("click_window_days") val clickWindowDays: ConversionAttributionWindowDays? = 30,

    @field:Valid
    @field:JsonProperty("engagement_window_days") val engagementWindowDays: ConversionAttributionWindowDays? = 30,

    @field:Valid
    @field:JsonProperty("view_window_days") val viewWindowDays: ConversionAttributionWindowDays? = 1,

    @field:Valid
    @field:JsonProperty("conversion_report_time") val conversionReportTime: ConversionReportTimeType? = "TIME_OF_AD_ACTION",

    @field:Valid
    @field:JsonProperty("attribution_types") val attributionTypes: kotlin.collections.List<ConversionReportAttributionType>? = null,

    @field:Valid
    @field:JsonProperty("report_format") val reportFormat: DataOutputFormat? = "JSON",

    @get:Size(min=1,max=500) 
    @field:JsonProperty("campaign_ids") val campaignIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @field:JsonProperty("campaign_statuses") val campaignStatuses: kotlin.collections.List<CampaignSummaryStatus>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @field:JsonProperty("campaign_objective_types") val campaignObjectiveTypes: kotlin.collections.List<ObjectiveType>? = null,

    @get:Size(min=1,max=500) 
    @field:JsonProperty("ad_group_ids") val adGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @field:JsonProperty("ad_group_statuses") val adGroupStatuses: kotlin.collections.List<AdGroupSummaryStatus>? = null,

    @get:Size(min=1,max=500) 
    @field:JsonProperty("ad_ids") val adIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @field:JsonProperty("ad_statuses") val adStatuses: kotlin.collections.List<PinPromotionSummaryStatus>? = null,

    @get:Size(min=1,max=500) 
    @field:JsonProperty("product_group_ids") val productGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @field:JsonProperty("product_group_statuses") val productGroupStatuses: kotlin.collections.List<ProductGroupSummaryStatus>? = null,

    @get:Size(min=1,max=500) 
    @field:JsonProperty("product_item_ids") val productItemIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=5) 
    @field:JsonProperty("targeting_types") val targetingTypes: kotlin.collections.List<AdsAnalyticsTargetingType>? = null,

    @field:Valid
    @get:Size(min=1)
    @field:JsonProperty("metrics_filters") val metricsFilters: kotlin.collections.List<AdsAnalyticsMetricsFilter>? = null
) {

}

