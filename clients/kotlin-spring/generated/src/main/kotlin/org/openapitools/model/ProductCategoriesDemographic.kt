package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GenderDemographics
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
 * Age and gender distribution who engaged with this product category in the past 3 months
 * @param age Age demographic distribution
 * @param gender 
 */
data class ProductCategoriesDemographic(

    @field:Valid
    @Schema(example = "null", required = true, description = "Age demographic distribution")
    @get:JsonProperty("age", required = true) val age: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("gender", required = true) val gender: GenderDemographics
) {

}

