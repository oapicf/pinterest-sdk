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
 * Gender demographic distribution
 * @param female Percentage of female users
 * @param male Percentage of male users
 * @param unspecified Percentage of users with unspecified gender
 */
data class GenderDemographics(

    @Schema(example = "null", required = true, description = "Percentage of female users")
    @get:JsonProperty("female", required = true) val female: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "Percentage of male users")
    @get:JsonProperty("male", required = true) val male: java.math.BigDecimal,

    @Schema(example = "null", required = true, description = "Percentage of users with unspecified gender")
    @get:JsonProperty("unspecified", required = true) val unspecified: java.math.BigDecimal
) {

}

