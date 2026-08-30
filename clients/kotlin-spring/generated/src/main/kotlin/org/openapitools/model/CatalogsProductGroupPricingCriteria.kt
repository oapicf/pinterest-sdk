package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param propertyValues 
 * @param inclusion 
 * @param negated 
 */
data class CatalogsProductGroupPricingCriteria(

    @get:DecimalMin(value="0")
    @Schema(required = true, description = "")
    @param:JsonProperty("values")
    @get:JsonProperty("values", required = true) val propertyValues: java.math.BigDecimal,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("inclusion")
    @get:JsonProperty("inclusion") val inclusion: kotlin.Boolean? = true,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("negated")
    @get:JsonProperty("negated") val negated: kotlin.Boolean? = null
) {

}

