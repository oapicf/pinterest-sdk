package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TemplateResponseDateRangeAbsoluteDateRange
import org.openapitools.model.TemplateResponseDateRangeDynamicDateRange
import org.openapitools.model.TemplateResponseDateRangeRelativeDateRange
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
 * @param dynamicDateRange 
 * @param relativeDateRange 
 * @param absoluteDateRange 
 */
data class TemplateResponseDateRange(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("dynamic_date_range") val dynamicDateRange: TemplateResponseDateRangeDynamicDateRange? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("relative_date_range") val relativeDateRange: TemplateResponseDateRangeRelativeDateRange? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("absolute_date_range") val absoluteDateRange: TemplateResponseDateRangeAbsoluteDateRange? = null
    ) {

}

