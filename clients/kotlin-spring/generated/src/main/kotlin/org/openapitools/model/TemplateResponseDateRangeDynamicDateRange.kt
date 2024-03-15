package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * The dynamic date range of the template
 * @param type The date range type
 * @param range The dynamic range type
 */
data class TemplateResponseDateRangeDynamicDateRange(

    @Schema(example = "dynamic", description = "The date range type")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "YEAR_TO_DATE", description = "The dynamic range type")
    @get:JsonProperty("range") val range: TemplateResponseDateRangeDynamicDateRange.Range? = null
) {

    /**
    * The dynamic range type
    * Values: YEAR_TO_DATE,QUARTER_TO_DATE,MONTH_TO_DATE,LAST_MONTH
    */
    enum class Range(val value: kotlin.String) {

        @JsonProperty("YEAR_TO_DATE") YEAR_TO_DATE("YEAR_TO_DATE"),
        @JsonProperty("QUARTER_TO_DATE") QUARTER_TO_DATE("QUARTER_TO_DATE"),
        @JsonProperty("MONTH_TO_DATE") MONTH_TO_DATE("MONTH_TO_DATE"),
        @JsonProperty("LAST_MONTH") LAST_MONTH("LAST_MONTH")
    }

}

