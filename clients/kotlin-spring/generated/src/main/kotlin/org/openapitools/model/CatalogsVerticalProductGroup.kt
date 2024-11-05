package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsProductGroup
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.model.CatalogsHotelProductGroup
import org.openapitools.model.CatalogsProductGroupStatus
import org.openapitools.model.CatalogsProductGroupType
import org.openapitools.model.CatalogsRetailProductGroup
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
 * @param id ID of the creative assets product group.
 * @param filters 
 * @param catalogId Catalog id pertaining to the creative assets product group.
 * @param feedId id of the catalogs feed belonging to this catalog product group
 * @param name Name of creative assets product group
 * @param description 
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 * @param type 
 * @param status 
 * @param createdAt Unix timestamp in seconds of when catalog product group was created.
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
 * @param country 
 * @param locale 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreativeAssetsProductGroup::class, name = "CREATIVE_ASSETS"),
      JsonSubTypes.Type(value = CatalogsHotelProductGroup::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailProductGroup::class, name = "RETAIL")
)

interface CatalogsVerticalProductGroup{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsVerticalProductGroup.CatalogType

                @get:Schema(example = "443727193917", requiredMode = Schema.RequiredMode.REQUIRED, description = "ID of the creative assets product group.")
        val id: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val filters: CatalogsCreativeAssetsProductGroupFilters

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "Catalog id pertaining to the creative assets product group.")
        val catalogId: kotlin.String

                @get:Schema(example = "2680059592705", requiredMode = Schema.RequiredMode.REQUIRED, description = "id of the catalogs feed belonging to this catalog product group")
        val feedId: kotlin.String

                @get:Schema(example = "Most Popular", description = "Name of creative assets product group")
        val name: kotlin.String? 

                @get:Schema(example = "null", description = "")
        val description: kotlin.String? 

                @get:Schema(example = "null", description = "boolean indicator of whether the product group is being featured or not")
        val isFeatured: kotlin.Boolean? 

                @get:Schema(example = "null", description = "")
        val type: CatalogsProductGroupType? 

                @get:Schema(example = "null", description = "")
        val status: CatalogsProductGroupStatus? 

                @get:Schema(example = "1621350033000", description = "Unix timestamp in seconds of when catalog product group was created.")
        val createdAt: kotlin.Int? 

                @get:Schema(example = "1622742155000", description = "Unix timestamp in seconds of last time catalog product group was updated.")
        val updatedAt: kotlin.Int? 

                @get:Schema(example = "null", description = "")
        val country: kotlin.String? 

                @get:Schema(example = "null", description = "")
        val locale: kotlin.String? 


    /**
    * 
    * Values: CREATIVE_ASSETS
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        CREATIVE_ASSETS("CREATIVE_ASSETS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CatalogType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

