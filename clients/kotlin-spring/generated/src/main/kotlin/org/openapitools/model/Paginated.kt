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
 * @param items 
 * @param bookmark 
 */
data class Paginated(

    @field:Valid
    @field:JsonProperty("items", required = true) val items: kotlin.collections.List<kotlin.Any>,

    @field:JsonProperty("bookmark") val bookmark: kotlin.String? = null
) {

}

