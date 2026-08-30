package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Product counts for a Creative Assets CatalogsProductGroup
 * @param appLinks 
 * @param catalogType 
 * @param images 
 * @param total 
 * @param videos 
 */
data class CatalogsCreativeAssetsProductGroupProductCounts(

    @get:DecimalMin(value="0")
    @Schema(required = true, description = "")
    @param:JsonProperty("app_links")
    @get:JsonProperty("app_links", required = true) val appLinks: java.math.BigDecimal,

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsCreativeAssetsProductGroupProductCounts.CatalogType = kotlin.String.CREATIVE_ASSETS,

    @get:DecimalMin(value="0")
    @Schema(required = true, description = "")
    @param:JsonProperty("images")
    @get:JsonProperty("images", required = true) val images: java.math.BigDecimal,

    @get:DecimalMin(value="0")
    @Schema(required = true, description = "")
    @param:JsonProperty("total")
    @get:JsonProperty("total", required = true) val total: java.math.BigDecimal,

    @get:DecimalMin(value="0")
    @Schema(required = true, description = "")
    @param:JsonProperty("videos")
    @get:JsonProperty("videos", required = true) val videos: java.math.BigDecimal
) : CatalogsProductGroupProductCountsVertical {

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

}

