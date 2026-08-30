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
 * 
 * @param conversionMetricsReady Are conversion metrics ready?
 * @param nonConversionMetricsReady Are non-conversion metrics ready?
 */
data class BookClosed(

    @Schema(example = "false", required = true, description = "Are conversion metrics ready?")
    @param:JsonProperty("conversion_metrics_ready")
    @get:JsonProperty("conversion_metrics_ready", required = true) val conversionMetricsReady: kotlin.Boolean,

    @Schema(example = "false", required = true, description = "Are non-conversion metrics ready?")
    @param:JsonProperty("non_conversion_metrics_ready")
    @get:JsonProperty("non_conversion_metrics_ready", required = true) val nonConversionMetricsReady: kotlin.Boolean
) {

}

