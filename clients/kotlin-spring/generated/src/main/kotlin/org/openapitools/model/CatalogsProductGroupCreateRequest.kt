package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * Request object for creating a product group.
 * @param feedId Catalog Feed id pertaining to the catalog product group.
 * @param filters 
 * @param name 
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 */
data class CatalogsProductGroupCreateRequest(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog Feed id pertaining to the catalog product group.")
    @param:JsonProperty("feed_id")
    @get:JsonProperty("feed_id", required = true) val feedId: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("filters")
    @get:JsonProperty("filters", required = true) val filters: CatalogsProductGroupFiltersRequest,

    @Schema(required = true, description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(description = "")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(description = "boolean indicator of whether the product group is being featured or not")
    @Deprecated(message = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_featured")
    @get:JsonProperty("is_featured") val isFeatured: kotlin.Boolean? = null
) : BulkUpsertRequestCreateCatalogProductGroupsItems, CatalogsProductGroupsCreateManyRequestItems, CatalogsProductGroupsCreateRequestSchema {

}

