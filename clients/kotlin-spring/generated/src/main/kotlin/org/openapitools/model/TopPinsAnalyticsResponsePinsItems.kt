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
 * @param dataStatus 
 * @param metrics 
 * @param pinId The pin id
 */
data class TopPinsAnalyticsResponsePinsItems(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("data_status")
    @get:JsonProperty("data_status") val dataStatus: kotlin.collections.Map<kotlin.String, DataStatus>? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("metrics")
    @get:JsonProperty("metrics") val metrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

    @Schema(description = "The pin id")
    @param:JsonProperty("pin_id")
    @get:JsonProperty("pin_id") val pinId: kotlin.String? = null
) {

}

