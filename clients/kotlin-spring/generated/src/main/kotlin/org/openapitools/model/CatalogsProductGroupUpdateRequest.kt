package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsProductGroupFiltersRequest
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
 * Request object for updating a product group.
 * @param name 
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 * @param filters 
 */
data class CatalogsProductGroupUpdateRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "boolean indicator of whether the product group is being featured or not")
    @get:JsonProperty("is_featured") val isFeatured: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("filters") val filters: CatalogsProductGroupFiltersRequest? = null
) {

}

