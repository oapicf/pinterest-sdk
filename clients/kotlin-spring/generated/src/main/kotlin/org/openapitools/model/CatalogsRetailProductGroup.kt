package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsProductGroupFilters
import org.openapitools.model.CatalogsProductGroupStatus
import org.openapitools.model.CatalogsProductGroupType
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
 * @param catalogType 
 * @param id ID of the catalog product group.
 * @param filters 
 * @param catalogId Catalog id pertaining to the retail product group.
 * @param feedId id of the catalogs feed belonging to this catalog product group
 * @param name Name of catalog product group
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 * @param type 
 * @param status 
 * @param createdAt Unix timestamp in seconds of when catalog product group was created.
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
 * @param country 
 * @param locale 
 */
data class CatalogsRetailProductGroup(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsRetailProductGroup.CatalogType,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "443727193917", required = true, description = "ID of the catalog product group.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("filters", required = true) val filters: CatalogsProductGroupFilters,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", required = true, description = "Catalog id pertaining to the retail product group.")
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "id of the catalogs feed belonging to this catalog product group")
    @get:JsonProperty("feed_id", required = true) val feedId: kotlin.String?,

    @Schema(example = "Most Popular", description = "Name of catalog product group")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "boolean indicator of whether the product group is being featured or not")
    @Deprecated(message = "")
    @get:JsonProperty("is_featured") val isFeatured: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: CatalogsProductGroupType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: CatalogsProductGroupStatus? = null,

    @Schema(example = "1621350033000", description = "Unix timestamp in seconds of when catalog product group was created.")
    @get:JsonProperty("created_at") val createdAt: kotlin.Int? = null,

    @Schema(example = "1622742155000", description = "Unix timestamp in seconds of last time catalog product group was updated.")
    @get:JsonProperty("updated_at") val updatedAt: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("country") val country: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locale") val locale: kotlin.String? = null
    ) {

    /**
    * 
    * Values: RETAIL
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        RETAIL("RETAIL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CatalogType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

