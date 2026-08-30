package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CatalogsProductGroupFilters
import org.openapitools.model.CatalogsProductGroupStatus
import org.openapitools.model.CatalogsProductGroupType
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
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
 * @param catalogId Catalog ID pertaining to the product group.
 * @param catalogType 
 * @param feedId id of the catalogs feed belonging to this catalog product group
 * @param filters 
 * @param id ID of the catalog product group.
 * @param type 
 * @param country 
 * @param createdAt Unix timestamp in seconds of when catalog product group was created.
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 * @param locale 
 * @param name Name of catalog product group
 * @param status 
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
 */
data class CatalogsRetailProductGroup(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog ID pertaining to the product group.")
    @param:JsonProperty("catalog_id")
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsRetailProductGroup.CatalogType = kotlin.String.RETAIL,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "id of the catalogs feed belonging to this catalog product group")
    @param:JsonProperty("feed_id")
    @get:JsonProperty("feed_id", required = true) val feedId: kotlin.String?,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("filters")
    @get:JsonProperty("filters", required = true) val filters: CatalogsProductGroupFilters,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "443727193917", required = true, description = "ID of the catalog product group.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: CatalogsProductGroupType,

    @Schema(description = "")
    @param:JsonProperty("country")
    @get:JsonProperty("country") val country: kotlin.String? = null,

    @Schema(example = "1621350033000", description = "Unix timestamp in seconds of when catalog product group was created.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at") val createdAt: kotlin.Int? = null,

    @Schema(description = "")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(description = "boolean indicator of whether the product group is being featured or not")
    @Deprecated(message = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_featured")
    @get:JsonProperty("is_featured") val isFeatured: kotlin.Boolean? = null,

    @Schema(description = "")
    @param:JsonProperty("locale")
    @get:JsonProperty("locale") val locale: kotlin.String? = null,

    @Schema(example = "Most Popular", description = "Name of catalog product group")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: CatalogsProductGroupStatus? = null,

    @Schema(example = "1622742155000", description = "Unix timestamp in seconds of last time catalog product group was updated.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("updated_at")
    @get:JsonProperty("updated_at") val updatedAt: kotlin.Int? = null
) : CatalogsVerticalProductGroup {

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
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogType'")
            }
        }
    }

}

