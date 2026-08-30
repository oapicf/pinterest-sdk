package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.PinAnalyticsDailyMetrics
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
 * @param dailyMetrics Array with the requested daily metric records
 * @param lifetimeMetrics The lifetime metric name and value.
 * @param summaryMetrics The metric name and value over the requested period for each requested metric
 */
data class PinAnalyticsMetricsResponse(

    @field:Valid
    @Schema(description = "Array with the requested daily metric records")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("daily_metrics")
    @get:JsonProperty("daily_metrics") val dailyMetrics: kotlin.collections.List<PinAnalyticsDailyMetrics>? = null,

    @Schema(example = "{\"TOTAL_COMMENTS\":10,\"TOTAL_REACTIONS\":12}", description = "The lifetime metric name and value.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lifetime_metrics")
    @get:JsonProperty("lifetime_metrics") val lifetimeMetrics: kotlin.collections.Map<kotlin.String, kotlin.Int>? = null,

    @field:Valid
    @Schema(example = "{\"IMPRESSION\":240,\"OUTBOUND_CLICK\":20,\"PIN_CLICK\":37,\"QUARTILE_95_PERCENT_VIEW\":8,\"SAVE\":20,\"SAVE_RATE\":0.18,\"VIDEO_10S_VIEW\":2,\"VIDEO_AVG_WATCH_TIME\":2507.75,\"VIDEO_MRC_VIEW\":20,\"VIDEO_START\":29,\"VIDEO_V50_WATCH_TIME\":10031}", description = "The metric name and value over the requested period for each requested metric")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("summary_metrics")
    @get:JsonProperty("summary_metrics") val summaryMetrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null
) {

}

