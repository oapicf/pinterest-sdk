package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.model.CatalogsCreativeAssetsProductGroupUpdateRequest
import org.openapitools.model.CatalogsHotelProductGroupUpdateRequest
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsRetailProductGroupUpdateRequest
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
 * Request object for updating a catalog based product group.
 * @param catalogType 
 * @param name 
 * @param description 
 * @param filters 
 * @param country 
 * @param locale 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreativeAssetsProductGroupUpdateRequest::class, name = "CREATIVE_ASSETS"),
      JsonSubTypes.Type(value = CatalogsHotelProductGroupUpdateRequest::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailProductGroupUpdateRequest::class, name = "RETAIL")
)

interface CatalogsVerticalProductGroupUpdateRequest{
                @get:Schema(example = "null", description = "")
        val catalogType: CatalogsVerticalProductGroupUpdateRequest.CatalogType? 

                @get:Schema(example = "null", description = "")
        val name: kotlin.String? 

                @get:Schema(example = "null", description = "")
        val description: kotlin.String? 

                @get:Schema(example = "null", description = "")
        val filters: CatalogsCreativeAssetsProductGroupFilters? 

                @get:Schema(example = "null", description = "")
        val country: Country? 

                @get:Schema(example = "null", description = "")
        val locale: CatalogsLocale? 


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

