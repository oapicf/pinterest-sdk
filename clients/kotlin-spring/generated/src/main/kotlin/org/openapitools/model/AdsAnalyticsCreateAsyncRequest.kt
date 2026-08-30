package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdAdsAnalyticsAsyncTargetingTypes
import org.openapitools.model.AdGroupSummaryStatus
import org.openapitools.model.AdsAnalyticsMetricsFilter
import org.openapitools.model.CampaignObjectiveType
import org.openapitools.model.CampaignSummaryStatus
import org.openapitools.model.ConversionAttributionWindowDays
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.ConversionReportTimeType
import org.openapitools.model.CustomConversionEventMetrics
import org.openapitools.model.DataOutputFormat
import org.openapitools.model.Granularity
import org.openapitools.model.MetricsReportingLevel
import org.openapitools.model.PinPromotionSummaryStatus
import org.openapitools.model.PrimarySort
import org.openapitools.model.ProductGroupSummaryStatus
import org.openapitools.model.ReportingColumnAsync
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
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
 * @param granularity   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
 * @param adGroupIds List of ad group ids
 * @param adGroupStatuses List of values for filtering
 * @param adIds List of ad ids. This parameter is not supported for Product Item level reports.
 * @param adStatuses List of values for filtering. This parameter is not supported for Product Item level reports.
 * @param attributionTypes List of attribution types for the conversion report.
 * @param campaignBrandLabel Campaign brand label for filtering.
 * @param campaignCustomLabel Campaign custom label for filtering.
 * @param campaignIds List of campaign ids
 * @param campaignObjectiveTypes List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
 * @param campaignStatuses List of status values for filtering
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action.
 * @param columns Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
 * @param combineTargetingTypes Determines if the targeting types included in the request should be consolidated into a single breakdown.
 * @param conversionReportTime Date dimension for conversion metrics.
 * @param customConversionEventMetrics List of advertiser-defined custom conversion event metrics to include in the report
 * @param endHour Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
 * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action.
 * @param level Level of the report
 * @param metricsFilters List of metrics filters
 * @param primarySort 
 * @param productGroupIds List of product group ids
 * @param productGroupStatuses List of values for filtering
 * @param productItemIds List of product item ids
 * @param reportFormat 
 * @param reportingTimezone Specify the timezone to be applied for the reporting.
 * @param startHour Which hour of the start date to begin the report. Only allowed for hourly reports.
 * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action.
 */
data class AdsAnalyticsCreateAsyncRequest(

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(required = true, description = "Metric report end date (UTC). Format: YYYY-MM-DD")
    @param:JsonProperty("end_date")
    @get:JsonProperty("end_date", required = true) val endDate: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "  TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.")
    @param:JsonProperty("granularity")
    @get:JsonProperty("granularity", required = true) val granularity: Granularity,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(required = true, description = "Metric report start date (UTC). Format: YYYY-MM-DD")
    @param:JsonProperty("start_date")
    @get:JsonProperty("start_date", required = true) val startDate: kotlin.String,

    @get:Size(min=1,max=500) 
    @Schema(description = "List of ad group ids")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_group_ids")
    @get:JsonProperty("ad_group_ids") val adGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @Schema(description = "List of values for filtering")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_group_statuses")
    @get:JsonProperty("ad_group_statuses") val adGroupStatuses: kotlin.collections.List<AdGroupSummaryStatus>? = null,

    @get:Size(min=1,max=500) 
    @Schema(description = "List of ad ids. This parameter is not supported for Product Item level reports.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_ids")
    @get:JsonProperty("ad_ids") val adIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @Schema(description = "List of values for filtering. This parameter is not supported for Product Item level reports.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_statuses")
    @get:JsonProperty("ad_statuses") val adStatuses: kotlin.collections.List<PinPromotionSummaryStatus>? = null,

    @field:Valid
    @Schema(description = "List of attribution types for the conversion report.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("attribution_types")
    @get:JsonProperty("attribution_types") val attributionTypes: kotlin.collections.List<ConversionReportAttributionType>? = null,

    @Schema(description = "Campaign brand label for filtering.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaign_brand_label")
    @get:JsonProperty("campaign_brand_label") val campaignBrandLabel: kotlin.String? = null,

    @Schema(description = "Campaign custom label for filtering.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaign_custom_label")
    @get:JsonProperty("campaign_custom_label") val campaignCustomLabel: kotlin.String? = null,

    @get:Size(min=1,max=500) 
    @Schema(description = "List of campaign ids")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaign_ids")
    @get:JsonProperty("campaign_ids") val campaignIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=7) 
    @Schema(description = "List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaign_objective_types")
    @get:JsonProperty("campaign_objective_types") val campaignObjectiveTypes: kotlin.collections.List<CampaignObjectiveType>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @Schema(description = "List of status values for filtering")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaign_statuses")
    @get:JsonProperty("campaign_statuses") val campaignStatuses: kotlin.collections.List<CampaignSummaryStatus>? = null,

    @field:Valid
    @Schema(description = "Number of days to use as the conversion attribution window for a pin click action.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("click_window_days")
    @get:JsonProperty("click_window_days") val clickWindowDays: ConversionAttributionWindowDays? = null,

    @field:Valid
    @Schema(description = "Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("columns")
    @get:JsonProperty("columns") val columns: kotlin.collections.List<ReportingColumnAsync>? = null,

    @Schema(description = "Determines if the targeting types included in the request should be consolidated into a single breakdown.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("combine_targeting_types")
    @get:JsonProperty("combine_targeting_types") val combineTargetingTypes: kotlin.Boolean? = false,

    @field:Valid
    @Schema(description = "Date dimension for conversion metrics.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_report_time")
    @get:JsonProperty("conversion_report_time") val conversionReportTime: ConversionReportTimeType? = null,

    @field:Valid
    @Schema(description = "List of advertiser-defined custom conversion event metrics to include in the report")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("custom_conversion_event_metrics")
    @get:JsonProperty("custom_conversion_event_metrics") val customConversionEventMetrics: kotlin.collections.List<CustomConversionEventMetrics>? = null,

    @get:Min(value=0)
    @get:Max(value=23)
    @Schema(description = "Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("end_hour")
    @get:JsonProperty("end_hour") val endHour: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "Number of days to use as the conversion attribution window for an engagement action.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("engagement_window_days")
    @get:JsonProperty("engagement_window_days") val engagementWindowDays: ConversionAttributionWindowDays? = null,

    @field:Valid
    @Schema(description = "Level of the report")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("level")
    @get:JsonProperty("level") val level: MetricsReportingLevel? = null,

    @field:Valid
    @get:Size(min=1)
    @Schema(description = "List of metrics filters")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("metrics_filters")
    @get:JsonProperty("metrics_filters") val metricsFilters: kotlin.collections.List<AdsAnalyticsMetricsFilter>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("primary_sort")
    @get:JsonProperty("primary_sort") val primarySort: PrimarySort? = null,

    @get:Size(min=1,max=500) 
    @Schema(description = "List of product group ids")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_group_ids")
    @get:JsonProperty("product_group_ids") val productGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @Schema(description = "List of values for filtering")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_group_statuses")
    @get:JsonProperty("product_group_statuses") val productGroupStatuses: kotlin.collections.List<ProductGroupSummaryStatus>? = null,

    @get:Size(min=1,max=500) 
    @Schema(description = "List of product item ids")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_item_ids")
    @get:JsonProperty("product_item_ids") val productItemIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("report_format")
    @get:JsonProperty("report_format") val reportFormat: DataOutputFormat? = null,

    @field:Valid
    @Schema(description = "Specify the timezone to be applied for the reporting.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("reporting_timezone")
    @get:JsonProperty("reporting_timezone") val reportingTimezone: ReportingTimeZone? = null,

    @get:Min(value=0)
    @get:Max(value=23)
    @Schema(description = "Which hour of the start date to begin the report. Only allowed for hourly reports.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("start_hour")
    @get:JsonProperty("start_hour") val startHour: kotlin.Int? = null,

    @field:Valid
    @get:Size(min=1,max=5) 
    @Schema(description = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("targeting_types")
    @get:JsonProperty("targeting_types") val targetingTypes: kotlin.collections.List<AdAdsAnalyticsAsyncTargetingTypes>? = null,

    @field:Valid
    @Schema(description = "Number of days to use as the conversion attribution window for a view action.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("view_window_days")
    @get:JsonProperty("view_window_days") val viewWindowDays: ConversionAttributionWindowDays? = null
) {

}

