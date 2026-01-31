package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdGroupSummaryStatus
import org.openapitools.model.AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
import org.openapitools.model.AdsAnalyticsMetricsFilter
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
 * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
 * @param columns Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
 * @param level Level of the report
 * @param attributionTypes List of types of attribution for the conversion report
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * @param campaignIds List of campaign ids
 * @param campaignStatuses List of status values for filtering
 * @param campaignObjectiveTypes List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
 * @param campaignBrandLabel Campaign brand label for filtering.
 * @param adGroupIds List of ad group ids
 * @param adGroupStatuses List of values for filtering
 * @param adIds List of ad ids [This parameter is no supported for Product Item Level Reports]
 * @param adStatuses List of values for filtering [This parameter is not supported for Product Item Level Reports]
 * @param productGroupIds List of product group ids
 * @param productGroupStatuses List of values for filtering
 * @param productItemIds List of product item ids
 * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
 * @param metricsFilters List of metrics filters
 * @param combineTargetingTypes Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users.
 * @param customConversionEventMetrics List of advertiser-defined custom conversion event metrics to include in the report
 * @param endHour Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
 * @param primarySort Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
 * @param reportFormat Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
 * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
 * @param startHour Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
 */
data class AdsAnalyticsCreateAsyncRequest(

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2020-12-20", required = true, description = "Metric report end date (UTC). Format: YYYY-MM-DD")
    @get:JsonProperty("end_date", required = true) val endDate: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly")
    @get:JsonProperty("granularity", required = true) val granularity: Granularity,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2020-12-20", required = true, description = "Metric report start date (UTC). Format: YYYY-MM-DD")
    @get:JsonProperty("start_date", required = true) val startDate: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.")
    @get:JsonProperty("columns", required = true) val columns: kotlin.collections.List<ReportingColumnAsync>,

    @field:Valid
    @Schema(example = "null", required = true, description = "Level of the report")
    @get:JsonProperty("level", required = true) val level: MetricsReportingLevel,

    @field:Valid
    @Schema(example = "null", description = "List of types of attribution for the conversion report")
    @get:JsonProperty("attribution_types") val attributionTypes: kotlin.collections.List<ConversionReportAttributionType>? = null,

    @field:Valid
    @Schema(example = "null", description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
    @get:JsonProperty("click_window_days") val clickWindowDays: ConversionAttributionWindowDays? = ConversionAttributionWindowDays._30,

    @field:Valid
    @Schema(example = "null", description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
    @get:JsonProperty("conversion_report_time") val conversionReportTime: ConversionReportTimeType? = "TIME_OF_AD_ACTION",

    @field:Valid
    @Schema(example = "null", description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
    @get:JsonProperty("engagement_window_days") val engagementWindowDays: ConversionAttributionWindowDays? = ConversionAttributionWindowDays._30,

    @field:Valid
    @Schema(example = "null", description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
    @get:JsonProperty("view_window_days") val viewWindowDays: ConversionAttributionWindowDays? = ConversionAttributionWindowDays._1,

    @get:Size(min=1,max=500) 
    @Schema(example = "[\"12345678\"]", description = "List of campaign ids")
    @get:JsonProperty("campaign_ids") val campaignIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @Schema(example = "[\"RUNNING\",\"PAUSED\"]", description = "List of status values for filtering")
    @get:JsonProperty("campaign_statuses") val campaignStatuses: kotlin.collections.List<CampaignSummaryStatus>? = null,

    @field:Valid
    @get:Size(min=1,max=7) 
    @Schema(example = "[\"AWARENESS\"]", description = "List of values for filtering. [\"WEB_SESSIONS\"] in BETA.")
    @get:JsonProperty("campaign_objective_types") val campaignObjectiveTypes: kotlin.collections.List<ObjectiveType>? = null,

    @Schema(example = "Brand", description = "Campaign brand label for filtering.")
    @get:JsonProperty("campaign_brand_label") val campaignBrandLabel: kotlin.String? = null,

    @get:Size(min=1,max=500) 
    @Schema(example = "[\"12345678\"]", description = "List of ad group ids")
    @get:JsonProperty("ad_group_ids") val adGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @Schema(example = "[\"RUNNING\",\"PAUSED\"]", description = "List of values for filtering")
    @get:JsonProperty("ad_group_statuses") val adGroupStatuses: kotlin.collections.List<AdGroupSummaryStatus>? = null,

    @get:Size(min=1,max=500) 
    @Schema(example = "[\"12345678\"]", description = "List of ad ids [This parameter is no supported for Product Item Level Reports]")
    @get:JsonProperty("ad_ids") val adIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @Schema(example = "[\"APPROVED\",\"PAUSED\"]", description = "List of values for filtering [This parameter is not supported for Product Item Level Reports]")
    @get:JsonProperty("ad_statuses") val adStatuses: kotlin.collections.List<PinPromotionSummaryStatus>? = null,

    @get:Size(min=1,max=500) 
    @Schema(example = "[\"12345678\"]", description = "List of product group ids")
    @get:JsonProperty("product_group_ids") val productGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @Schema(example = "[\"RUNNING\",\"PAUSED\"]", description = "List of values for filtering")
    @get:JsonProperty("product_group_statuses") val productGroupStatuses: kotlin.collections.List<ProductGroupSummaryStatus>? = null,

    @get:Size(min=1,max=500) 
    @Schema(example = "[\"12345678\"]", description = "List of product item ids")
    @get:JsonProperty("product_item_ids") val productItemIds: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(min=1,max=5) 
    @Schema(example = "null", description = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.")
    @get:JsonProperty("targeting_types") val targetingTypes: kotlin.collections.List<AdsAnalyticsCreateAsyncRequest.TargetingTypes>? = null,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", description = "List of metrics filters")
    @get:JsonProperty("metrics_filters") val metricsFilters: kotlin.collections.List<AdsAnalyticsMetricsFilter>? = null,

    @Schema(example = "false", description = "Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users.")
    @get:JsonProperty("combine_targeting_types") val combineTargetingTypes: kotlin.Boolean? = false,

    @field:Valid
    @Schema(example = "null", description = "List of advertiser-defined custom conversion event metrics to include in the report")
    @get:JsonProperty("custom_conversion_event_metrics") val customConversionEventMetrics: kotlin.collections.List<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics>? = null,

    @get:Min(value=0)
    @get:Max(value=23)
    @Schema(example = "null", description = "Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.")
    @get:JsonProperty("end_hour") val endHour: kotlin.Int? = null,

    @Schema(example = "BY_ID", description = "Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.")
    @get:JsonProperty("primary_sort") val primarySort: AdsAnalyticsCreateAsyncRequest.PrimarySort? = null,

    @field:Valid
    @Schema(example = "null", description = "Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.")
    @get:JsonProperty("report_format") val reportFormat: DataOutputFormat? = "JSON",

    @field:Valid
    @Schema(example = "null", description = "Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.")
    @get:JsonProperty("reporting_timezone") val reportingTimezone: ReportingTimeZone? = null,

    @get:Min(value=0)
    @get:Max(value=23)
    @Schema(example = "null", description = "Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.")
    @get:JsonProperty("start_hour") val startHour: kotlin.Int? = null
) {

    /**
    * List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
    * Values: KEYWORD,APPTYPE,GENDER,LOCATION,PLACEMENT,COUNTRY,TARGETED_INTEREST,PINNER_INTEREST,AUDIENCE_INCLUDE,GEO,AGE_BUCKET,REGION,MEDIA_TYPE,AGE_BUCKET_AND_GENDER,AUDIENCE_MULTIPLIER,CREATIVE_ENHANCEMENTS,LOCAL_ADS_STORE_CODE
    */
    enum class TargetingTypes(@get:JsonValue val value: kotlin.String) {

        KEYWORD("KEYWORD"),
        APPTYPE("APPTYPE"),
        GENDER("GENDER"),
        LOCATION("LOCATION"),
        PLACEMENT("PLACEMENT"),
        COUNTRY("COUNTRY"),
        TARGETED_INTEREST("TARGETED_INTEREST"),
        PINNER_INTEREST("PINNER_INTEREST"),
        AUDIENCE_INCLUDE("AUDIENCE_INCLUDE"),
        GEO("GEO"),
        AGE_BUCKET("AGE_BUCKET"),
        REGION("REGION"),
        MEDIA_TYPE("MEDIA_TYPE"),
        AGE_BUCKET_AND_GENDER("AGE_BUCKET_AND_GENDER"),
        AUDIENCE_MULTIPLIER("AUDIENCE_MULTIPLIER"),
        CREATIVE_ENHANCEMENTS("CREATIVE_ENHANCEMENTS"),
        LOCAL_ADS_STORE_CODE("LOCAL_ADS_STORE_CODE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): TargetingTypes {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdsAnalyticsCreateAsyncRequest'")
            }
        }
    }

    /**
    * Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
    * Values: BY_ID,BY_DATE
    */
    enum class PrimarySort(@get:JsonValue val value: kotlin.String) {

        BY_ID("BY_ID"),
        BY_DATE("BY_DATE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PrimarySort {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AdsAnalyticsCreateAsyncRequest'")
            }
        }
    }

}

