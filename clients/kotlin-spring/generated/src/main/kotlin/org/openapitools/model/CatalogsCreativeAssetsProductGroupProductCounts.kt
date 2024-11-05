package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param catalogType 
 * @param total 
 * @param videos 
 */
data class CatalogsCreativeAssetsProductGroupProductCounts(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsCreativeAssetsProductGroupProductCounts.CatalogType,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("total", required = true) val total: java.math.BigDecimal,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("videos", required = true) val videos: java.math.BigDecimal
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

