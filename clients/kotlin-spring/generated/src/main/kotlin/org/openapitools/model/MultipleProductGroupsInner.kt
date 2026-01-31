package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsProductGroupCreateRequest
import org.openapitools.model.CatalogsProductGroupFiltersRequest
import org.openapitools.model.CatalogsVerticalProductGroupCreateRequest
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
 * @param feedId Catalog Feed id pertaining to the catalog product group.
 * @param filters 
 * @param name 
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 */
data class MultipleProductGroupsInner(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog Feed id pertaining to the catalog product group.")
    @get:JsonProperty("feed_id", required = true) val feedId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("filters", required = true) val filters: CatalogsProductGroupFiltersRequest,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog id pertaining to the creative assets product group.")
    @get:JsonProperty("catalog_id", required = true) override val catalogId: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: MultipleProductGroupsInner.CatalogType,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "boolean indicator of whether the product group is being featured or not")
    @Deprecated(message = "")
    @get:JsonProperty("is_featured") val isFeatured: kotlin.Boolean? = false,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("country") override val country: Country? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("locale") override val locale: CatalogsLocale? = null
) {

}

