package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsProductGroupFiltersRequest
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param description 
 * @param filters 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 * @param name 
 */
data class CatalogsProductGroupUpdateRequest(

    @Schema(description = "")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("filters")
    @get:JsonProperty("filters") val filters: CatalogsProductGroupFiltersRequest? = null,

    @Schema(description = "boolean indicator of whether the product group is being featured or not")
    @Deprecated(message = "")
    @param:JsonProperty("is_featured")
    @get:JsonProperty("is_featured") val isFeatured: kotlin.Boolean? = null,

    @Schema(description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null
) : BulkUpsertRequestUpdateCatalogProductGroupsItems, CatalogsProductGroupsUpdateRequestSchema {

}

