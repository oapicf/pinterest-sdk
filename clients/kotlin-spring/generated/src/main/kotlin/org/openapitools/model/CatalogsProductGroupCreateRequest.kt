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
 * Request object for creating a product group.
 * @param name 
 * @param filters 
 * @param feedId Catalog Feed id pertaining to the catalog product group.
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 */
data class CatalogsProductGroupCreateRequest(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("filters", required = true) val filters: CatalogsProductGroupFiltersRequest,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog Feed id pertaining to the catalog product group.")
    @get:JsonProperty("feed_id", required = true) val feedId: kotlin.String,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "boolean indicator of whether the product group is being featured or not")
    @get:JsonProperty("is_featured") val isFeatured: kotlin.Boolean? = false
) {

}

