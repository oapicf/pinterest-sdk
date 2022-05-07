package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsProductGroupFilters
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Request object for updating a product group.
 * @param feedId Catalog Feed id pertaining to the catalog product group.
 * @param name 
 * @param filters 
 * @param description 
 */
data class CatalogsProductGroupUpdateRequest(
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("feed_id", required = true) val feedId: kotlin.String,

    @field:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @field:JsonProperty("filters", required = true) val filters: CatalogsProductGroupFilters,

    @field:JsonProperty("description") val description: kotlin.String? = null
) {

}

