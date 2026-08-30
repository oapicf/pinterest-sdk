package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CatalogsCreativeAssetsAttributes
import org.openapitools.model.Pin
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
 * Object describing a creative assets item record
 * @param catalogType 
 * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload.
 * @param attributes 
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace
 * @param pins The pins mapped to the item
 */
data class CatalogsCreativeAssetsItemResponse(

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsCreativeAssetsItemResponse.CatalogType,

    @Schema(required = true, description = "Discriminator literal identifying this leaf inside an `ItemResponse` payload.")
    @param:JsonProperty("item_response_kind")
    @get:JsonProperty("item_response_kind", required = true) override val itemResponseKind: CatalogsCreativeAssetsItemResponse.ItemResponseKind = kotlin.String.creative_assets_item,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("attributes")
    @get:JsonProperty("attributes") val attributes: CatalogsCreativeAssetsAttributes? = null,

    @Schema(example = "DS0294-M", description = "The catalog creative assets id in the merchant namespace")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("creative_assets_id")
    @get:JsonProperty("creative_assets_id") val creativeAssetsId: kotlin.String? = null,

    @field:Valid
    @get:Size(max=11)
    @Schema(description = "The pins mapped to the item")
    @param:JsonProperty("pins")
    @get:JsonProperty("pins") val pins: kotlin.collections.List<Pin>? = null
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
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogType'")
            }
        }
    }

    /**
    * Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    * Values: creative_assets_item
    */
    enum class ItemResponseKind(@get:JsonValue val value: kotlin.String) {

        creative_assets_item("creative_assets_item");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ItemResponseKind {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ItemResponseKind'")
            }
        }
    }

}

