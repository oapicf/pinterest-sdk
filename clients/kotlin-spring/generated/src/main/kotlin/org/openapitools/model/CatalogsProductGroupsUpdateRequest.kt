package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsProductGroupFiltersRequest
import org.openapitools.model.CatalogsProductGroupUpdateRequest
import org.openapitools.model.CatalogsVerticalProductGroupUpdateRequest
import org.openapitools.model.Country
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
 * 
 * @param name 
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 * @param filters 
 */
data class CatalogsProductGroupsUpdateRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "boolean indicator of whether the product group is being featured or not")
    @Deprecated(message = "")
    @get:JsonProperty("is_featured") val isFeatured: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("filters") val filters: CatalogsProductGroupFiltersRequest? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("catalog_type") override val catalogType: CatalogsProductGroupsUpdateRequest.CatalogType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("country") override val country: Country? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("locale") override val locale: CatalogsLocale? = null
    ) {

}

