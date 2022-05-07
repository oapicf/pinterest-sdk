package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param inclusion 
 * @param propertyValues 
 * @param negated 
 */
data class CatalogsProductGroupPricingCriteria(

    @field:JsonProperty("inclusion", required = true) val inclusion: kotlin.Boolean,

    @field:JsonProperty("values", required = true) val propertyValues: java.math.BigDecimal,

    @field:JsonProperty("negated", required = true) val negated: kotlin.Boolean
) {

}

