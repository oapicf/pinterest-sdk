package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsProductGroupCreateRequest
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.model.CatalogsHotelProductGroupCreateRequest
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsRetailProductGroupCreateRequest
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
 * Request object for creating a catalog based product group.
 * @param catalogType 
 * @param name 
 * @param filters 
 * @param catalogId Catalog id pertaining to the creative assets product group.
 * @param country 
 * @param locale 
 * @param description 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreativeAssetsProductGroupCreateRequest::class, name = "CREATIVE_ASSETS"),
      JsonSubTypes.Type(value = CatalogsHotelProductGroupCreateRequest::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailProductGroupCreateRequest::class, name = "RETAIL")
)

interface CatalogsVerticalProductGroupCreateRequest{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsVerticalProductGroupCreateRequest.CatalogType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val name: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val filters: CatalogsCreativeAssetsProductGroupFilters

                @get:Schema(example = "2680059592705", requiredMode = Schema.RequiredMode.REQUIRED, description = "Catalog id pertaining to the creative assets product group.")
        val catalogId: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val country: Country

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val locale: CatalogsLocale

                @get:Schema(example = "null", description = "")
        val description: kotlin.String? 


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

