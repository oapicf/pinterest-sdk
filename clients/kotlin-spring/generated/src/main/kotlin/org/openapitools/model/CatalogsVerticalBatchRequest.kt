package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsBatchItem
import org.openapitools.model.CatalogsCreativeAssetsBatchRequest
import org.openapitools.model.CatalogsHotelBatchRequest
import org.openapitools.model.CatalogsItemsRequestLanguage
import org.openapitools.model.CatalogsRetailBatchRequest
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
 * A request object that can have multiple operations on a single batch
 * @param catalogType 
 * @param country 
 * @param language 
 * @param items Array with creative assets item operations
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreativeAssetsBatchRequest::class, name = "CREATIVE_ASSETS"),
      JsonSubTypes.Type(value = CatalogsHotelBatchRequest::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailBatchRequest::class, name = "RETAIL")
)

interface CatalogsVerticalBatchRequest{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsVerticalBatchRequest.CatalogType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val country: Country

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val language: CatalogsItemsRequestLanguage

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "Array with creative assets item operations")
        val items: kotlin.collections.List<CatalogsCreativeAssetsBatchItem>

                @get:Schema(example = "2680059592705", description = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
        val catalogId: kotlin.String? 


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

