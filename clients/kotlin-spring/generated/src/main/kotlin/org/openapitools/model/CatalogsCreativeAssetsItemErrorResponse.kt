package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ItemValidationEvent
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
 * Object describing a creative assets item error
 * @param catalogType 
 * @param errors Array with the errors for the item id requested
 * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload.
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace
 */
data class CatalogsCreativeAssetsItemErrorResponse(

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type", required = true)
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsCreativeAssetsItemErrorResponse.CatalogType,

    @field:Valid
    @Schema(required = true, description = "Array with the errors for the item id requested")
    @param:JsonProperty("errors", required = true)
    @get:JsonProperty("errors", required = true) val errors: kotlin.collections.List<ItemValidationEvent>,

    @Schema(required = true, description = "Discriminator literal identifying this leaf inside an `ItemResponse` payload.")
    @param:JsonProperty("item_response_kind", required = true)
    @get:JsonProperty("item_response_kind", required = true) override val itemResponseKind: CatalogsCreativeAssetsItemErrorResponse.ItemResponseKind = kotlin.String.creative_assets_item_error,

    @Schema(example = "DS0294-M", description = "The catalog creative assets id in the merchant namespace")
    @param:JsonProperty("creative_assets_id")
    @get:JsonProperty("creative_assets_id") val creativeAssetsId: kotlin.String? = null
) : ItemResponse {

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
                return values().firstOrNull{ it.value == value }
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogType'")
            }
        }
    }

    /**
    * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    * Values: creative_assets_item_error
    */
    enum class ItemResponseKind(@get:JsonValue val value: kotlin.String) {

        creative_assets_item_error("creative_assets_item_error");
    
        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ItemResponseKind {
                return values().firstOrNull{ it.value == value }
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ItemResponseKind'")
            }
        }
    }

}

