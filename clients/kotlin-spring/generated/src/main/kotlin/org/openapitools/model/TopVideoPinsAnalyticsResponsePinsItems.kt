package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
data class TopVideoPinsAnalyticsResponsePinsItems(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("data_status")
    @get:JsonProperty("data_status") val dataStatus: kotlin.collections.Map<kotlin.String, DataStatus>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("metrics")
    @get:JsonProperty("metrics") val metrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

    @Schema(description = "The pin id")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pin_id")
    @get:JsonProperty("pin_id") val pinId: kotlin.String? = null
) {

}

