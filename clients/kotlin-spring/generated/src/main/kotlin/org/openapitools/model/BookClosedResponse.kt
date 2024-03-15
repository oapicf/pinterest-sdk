package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Creation fields
 * @param conversionMetricsReady Are conversion metrics ready?
 * @param nonConversionMetricsReady Are non-conversion metrics ready?
 */
data class BookClosedResponse(

    @Schema(example = "false", description = "Are conversion metrics ready?")
    @get:JsonProperty("conversion_metrics_ready") val conversionMetricsReady: kotlin.Boolean? = null,

    @Schema(example = "false", description = "Are non-conversion metrics ready?")
    @get:JsonProperty("non_conversion_metrics_ready") val nonConversionMetricsReady: kotlin.Boolean? = null
) {

}

