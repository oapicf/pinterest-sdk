package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Information about a catalog asset.
 * @param catalogType Catalog type
 * @param id Catalog ID.
 * @param name Catalog name
 */
data class CatalogBinding(

    @Schema(description = "Catalog type")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type") val catalogType: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Catalog ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(description = "Catalog name")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null
) {

}

