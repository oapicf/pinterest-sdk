package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.model.CatalogsHotelListProductsByCatalogBasedFilterRequest
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsRetailListProductsByCatalogBasedFilterRequest
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
 * Request object to list products for a given catalog_id and product group filter.
 * @param catalogType 
 * @param catalogId Catalog id pertaining to the creative assets product group.
 * @param filters 
 * @param country 
 * @param locale 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest::class, name = "CREATIVE_ASSETS"),
      JsonSubTypes.Type(value = CatalogsHotelListProductsByCatalogBasedFilterRequest::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailListProductsByCatalogBasedFilterRequest::class, name = "RETAIL")
)

interface CatalogsVerticalsListProductsByCatalogBasedFilterRequest{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsVerticalsListProductsByCatalogBasedFilterRequest.CatalogType

                @get:Schema(example = "2680059592705", requiredMode = Schema.RequiredMode.REQUIRED, description = "Catalog id pertaining to the creative assets product group.")
        val catalogId: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val filters: CatalogsCreativeAssetsProductGroupFilters

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val country: Country

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val locale: CatalogsLocale


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

