package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsBatchItem
import org.openapitools.model.CatalogsItemsRequestLanguage
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
 * Request object to update catalogs creative assets items
 * @param catalogType 
 * @param country 
 * @param language 
 * @param items Array with creative assets item operations
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 */
data class CatalogsCreativeAssetsBatchRequest(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsCreativeAssetsBatchRequest.CatalogType,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("country", required = true) val country: Country,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("language", required = true) val language: CatalogsItemsRequestLanguage,

    @field:Valid
    @get:Size(min=1,max=1000) 
    @Schema(example = "null", required = true, description = "Array with creative assets item operations")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<CatalogsCreativeAssetsBatchItem>,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", description = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null
    ) {

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

