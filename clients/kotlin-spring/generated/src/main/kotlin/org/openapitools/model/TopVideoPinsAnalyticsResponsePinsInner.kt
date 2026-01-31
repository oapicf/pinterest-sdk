package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DataStatus
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
 * Array with metrics, status, and pin id for the requested metric
 * @param metrics The metric name and daily value for each requested metric
 * @param dataStatus 
 * @param pinId The pin id
 */
data class TopVideoPinsAnalyticsResponsePinsInner(

    @field:Valid
    @Schema(example = "{\"IMPRESSION\":7,\"QUARTILE_95_PERCENT_VIEW\":2,\"SAVE\":1,\"VIDEO_10S_VIEW\":5,\"VIDEO_AVG_WATCH_TIME\":86989,\"VIDEO_MRC_VIEW\":2,\"VIDEO_START\":2,\"VIDEO_V50_WATCH_TIME\":173979,\"OUTBOUND_CLICK\":2}", description = "The metric name and daily value for each requested metric")
    @get:JsonProperty("metrics") val metrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("data_status") val dataStatus: kotlin.collections.Map<kotlin.String, DataStatus>? = null,

    @Schema(example = "642396334344813594", description = "The pin id")
    @get:JsonProperty("pin_id") val pinId: kotlin.String? = null
) {

}

