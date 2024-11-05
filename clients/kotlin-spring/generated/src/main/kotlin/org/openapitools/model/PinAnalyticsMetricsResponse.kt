package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PinAnalyticsMetricsResponseDailyMetricsInner
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
 * @param lifetimeMetrics The lifetime metric name and value.
 * @param dailyMetrics Array with the requested daily metric records
 * @param summaryMetrics The metric name and value over the requested period for each requested metric
 */
data class PinAnalyticsMetricsResponse(

    @Schema(example = "{\"TOTAL_COMMENTS\":10,\"TOTAL_REACTIONS\":12}", description = "The lifetime metric name and value.")
    @get:JsonProperty("lifetime_metrics") val lifetimeMetrics: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,

    @field:Valid
    @Schema(example = "null", description = "Array with the requested daily metric records")
    @get:JsonProperty("daily_metrics") val dailyMetrics: kotlin.collections.List<PinAnalyticsMetricsResponseDailyMetricsInner>? = null,

    @field:Valid
    @Schema(example = "{\"IMPRESSION\":240,\"OUTBOUND_CLICK\":20,\"PIN_CLICK\":37,\"QUARTILE_95_PERCENT_VIEW\":8,\"SAVE\":20,\"SAVE_RATE\":0.18,\"VIDEO_10S_VIEW\":2,\"VIDEO_AVG_WATCH_TIME\":2507.75,\"VIDEO_MRC_VIEW\":20,\"VIDEO_START\":29,\"VIDEO_V50_WATCH_TIME\":10031}", description = "The metric name and value over the requested period for each requested metric")
    @get:JsonProperty("summary_metrics") val summaryMetrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null
    ) {

}

