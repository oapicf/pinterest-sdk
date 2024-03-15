package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelProductGroup
import org.openapitools.model.CatalogsProductGroupFilters
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
 * @param id ID of the catalog product group.
 * @param filters 
 * @param catalogId 
 * @param feedId 
 * @param name Name of catalog product group
 * @param description 
 * @param createdAt Unix timestamp in seconds of when catalog product group was created.
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
 * @param isFeatured boolean indicator of whether the product group is being featured or not
 * @param type 
 * @param status 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsHotelProductGroup::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailProductGroup::class, name = "RETAIL")
)

interface CatalogsVerticalProductGroup{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsVerticalProductGroup.CatalogType

                @get:Schema(example = "443727193917", requiredMode = Schema.RequiredMode.REQUIRED, description = "ID of the catalog product group.")
        val id: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val filters: CatalogsProductGroupFilters

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogId: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val feedId: CatalogsVerticalProductGroup.FeedId

                @get:Schema(example = "Most Popular", description = "Name of catalog product group")
        val name: kotlin.String? 

                @get:Schema(example = "null", description = "")
        val description: kotlin.String? 

                @get:Schema(example = "1621350033000", description = "Unix timestamp in seconds of when catalog product group was created.")
        val createdAt: kotlin.Int? 

                @get:Schema(example = "1622742155000", description = "Unix timestamp in seconds of last time catalog product group was updated.")
        val updatedAt: kotlin.Int? 

                @get:Schema(example = "null", description = "boolean indicator of whether the product group is being featured or not")
        val isFeatured: kotlin.Boolean? 

                @get:Schema(example = "null", description = "")
        val type: CatalogsProductGroupType? 

                @get:Schema(example = "null", description = "")
        val status: CatalogsProductGroupStatus? 


    /**
    * 
    * Values: RETAIL
    */
    enum class CatalogType(val value: kotlin.String) {

        @JsonProperty("RETAIL") RETAIL("RETAIL")
    }

    /**
    * 
    * Values: `null`
    */
    enum class FeedId(val value: kotlin.String) {

        @JsonProperty("null") `null`("null")
    }

}

