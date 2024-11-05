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
 * The relative date range of the template
 * @param type The date range type
 * @param startDaysInPast The start date of the date range
 * @param endDaysInPast The end date of the date range
 */
data class TemplateResponseDateRangeRelativeDateRange(

    @Schema(example = "relative", description = "The date range type")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "14", description = "The start date of the date range")
    @get:JsonProperty("start_days_in_past") val startDaysInPast: java.math.BigDecimal? = null,

    @Schema(example = "7", description = "The end date of the date range")
    @get:JsonProperty("end_days_in_past") val endDaysInPast: java.math.BigDecimal? = null
    ) {

}

