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
 * @param propertyValues 
 * @param negated 
 */
data class CatalogsProductGroupMultipleStringListCriteria(

    @field:JsonProperty("values", required = true) val propertyValues: kotlin.collections.List<kotlin.collections.List<kotlin.String>>,

    @field:JsonProperty("negated", required = true) val negated: kotlin.Boolean
) {

}

