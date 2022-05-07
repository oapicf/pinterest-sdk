package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AnalyticsMetricsResponseDailyMetrics
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
 * @param dailyMetrics Array with the requested daily metric records
 * @param summaryMetrics The metric name and value over the requested period for each requested metric
 */
data class AnalyticsMetricsResponse(

    @field:Valid
    @field:JsonProperty("daily_metrics") val dailyMetrics: kotlin.collections.List<AnalyticsMetricsResponseDailyMetrics>? = null,

    @field:Valid
    @field:JsonProperty("summary_metrics") val summaryMetrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null
) {

}

