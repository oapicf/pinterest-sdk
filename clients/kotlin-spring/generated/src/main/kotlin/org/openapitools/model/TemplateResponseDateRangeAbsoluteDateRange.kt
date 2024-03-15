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
 * The absolute date range of the template
 * @param type The date range type
 * @param startDate The start date of the date range
 * @param endDate The end date of the date range
 */
data class TemplateResponseDateRangeAbsoluteDateRange(

    @Schema(example = "absolute", description = "The date range type")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "0.8008281904610115", description = "The start date of the date range")
    @get:JsonProperty("start_date") val startDate: java.math.BigDecimal? = null,

    @Schema(example = "6.027456183070403", description = "The end date of the date range")
    @get:JsonProperty("end_date") val endDate: java.math.BigDecimal? = null
) {

}

