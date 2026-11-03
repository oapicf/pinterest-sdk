package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * 
 * @param dataStatus 
 * @param date Metrics date (UTC): YYYY-MM-DD.
 * @param metrics 
 */
data class AnalyticsDailyMetrics(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("data_status")
    @get:JsonProperty("data_status") val dataStatus: DataStatus? = null,

    @Schema(example = "2019-12-01", description = "Metrics date (UTC): YYYY-MM-DD.")
    @param:JsonProperty("date")
    @get:JsonProperty("date") val date: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("metrics")
    @get:JsonProperty("metrics") val metrics: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null
) {

}

