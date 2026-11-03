package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelProductGroupFilters
import org.openapitools.model.CatalogsHotelProductGroupType
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
 * @param filters 
 * @param id ID of the catalog product group.
 * @param type 
 * @param createdAt Unix timestamp in seconds of when catalog product group was created.
 * @param description 
 * @param name Name of catalog product group
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
 */
data class CatalogsHotelProductGroup(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog ID pertaining to the product group.")
    @param:JsonProperty("catalog_id", required = true)
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type", required = true)
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsHotelProductGroup.CatalogType = kotlin.String.HOTEL,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("filters", required = true)
    @get:JsonProperty("filters", required = true) val filters: CatalogsHotelProductGroupFilters,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "443727193917", required = true, description = "ID of the catalog product group.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("type", required = true)
    @get:JsonProperty("type", required = true) val type: CatalogsHotelProductGroupType,

    @Schema(example = "1621350033000", description = "Unix timestamp in seconds of when catalog product group was created.")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at") val createdAt: kotlin.Int? = null,

    @Schema(description = "")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "Most Popular", description = "Name of catalog product group")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "1622742155000", description = "Unix timestamp in seconds of last time catalog product group was updated.")
    @param:JsonProperty("updated_at")
    @get:JsonProperty("updated_at") val updatedAt: kotlin.Int? = null
) : CatalogsVerticalProductGroup {

    /**
    * 
    * Values: HOTEL
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        HOTEL("HOTEL");
    
        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CatalogType {
                return values().firstOrNull{ it.value == value }
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogType'")
            }
        }
    }

}

