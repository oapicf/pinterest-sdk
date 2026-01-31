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
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
 * @param catalogType Catalog type
 * @param id Catalog ID.
 * @param name Catalog name
 */
data class GetBusinessAssetsResponseCatalogInfo(

    @Schema(example = "PRODUCT", description = "Catalog type")
    @get:JsonProperty("catalog_type") val catalogType: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "4836859046874", description = "Catalog ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "Canada Catalog", description = "Catalog name")
    @get:JsonProperty("name") val name: kotlin.String? = null
) {

}

