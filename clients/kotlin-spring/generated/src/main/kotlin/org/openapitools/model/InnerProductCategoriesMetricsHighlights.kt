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
 * @param pctChangeMom Month-over-month percentage change
 */
data class InnerProductCategoriesMetricsHighlights(

    @Schema(example = "null", required = true, description = "Month-over-month percentage change")
    @get:JsonProperty("pct_change_mom", required = true) val pctChangeMom: java.math.BigDecimal
) {

}

