package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConversionAttributionWindowDays
import org.openapitools.model.ConversionReportAttributionType
import org.openapitools.model.ConversionReportTimeType
import org.openapitools.model.Granularity
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
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * @param attributionTypes List of types of attribution for the conversion report
 */
data class AdsAnalyticsCreateAsyncRequestAllOf(
    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @field:JsonProperty("start_date", required = true) val startDate: kotlin.String,
    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @field:JsonProperty("end_date", required = true) val endDate: kotlin.String,

    @field:Valid
    @field:JsonProperty("granularity", required = true) val granularity: Granularity,

    @field:Valid
    @field:JsonProperty("click_window_days") val clickWindowDays: ConversionAttributionWindowDays? = 30,

    @field:Valid
    @field:JsonProperty("engagement_window_days") val engagementWindowDays: ConversionAttributionWindowDays? = 30,

    @field:Valid
    @field:JsonProperty("view_window_days") val viewWindowDays: ConversionAttributionWindowDays? = 1,

    @field:Valid
    @field:JsonProperty("conversion_report_time") val conversionReportTime: ConversionReportTimeType? = "TIME_OF_AD_ACTION",

    @field:Valid
    @field:JsonProperty("attribution_types") val attributionTypes: kotlin.collections.List<ConversionReportAttributionType>? = null
) {

}

