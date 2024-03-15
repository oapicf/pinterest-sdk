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
data class TopPinsAnalyticsResponsePinsInner(

    @field:Valid
    @Schema(example = "{\"CLOSEUP\":1,\"CLOSEUP_RATE\":0,\"ENGAGEMENT\":1,\"ENGAGEMENT_RATE\":0,\"IMPRESSION\":240,\"OUTBOUND_CLICK\":20,\"OUTBOUND_CLICK_RATE\":0.08,\"PIN_CLICK\":37,\"PIN_CLICK_RATE\":0.15,\"QUARTILE_95_PERCENT_VIEW\":8,\"SAVE\":20,\"SAVE_RATE\":0.18,\"VIDEO_10S_VIEW\":2,\"VIDEO_AVG_WATCH_TIME\":2507.75,\"VIDEO_MRC_VIEW\":20,\"VIDEO_START\":29,\"VIDEO_V50_WATCH_TIME\":10031}", description = "The metric name and daily value for each requested metric")
    @get:JsonProperty("metrics") val metrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("data_status") val dataStatus: kotlin.collections.Map<kotlin.String, DataStatus>? = null,

    @Schema(example = "642396334344813594", description = "The pin id")
    @get:JsonProperty("pin_id") val pinId: kotlin.String? = null
) {

}

