package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsProductGroupFilterKeys
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
 * @param anyOf 
 */
data class CatalogsProductGroupFiltersAnyOf(

    @field:Valid
    @field:JsonProperty("any_of") val anyOf: kotlin.collections.List<CatalogsProductGroupFilterKeys>? = null
) {

}

