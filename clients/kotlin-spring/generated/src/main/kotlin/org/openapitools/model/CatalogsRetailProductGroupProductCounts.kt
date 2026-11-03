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
 * Product counts for a Retail CatalogsProductGroup
 * @param catalogType 
 * @param inStock 
 * @param outOfStock 
 * @param preorder 
 * @param total 
 * @param videos 
 */
data class CatalogsRetailProductGroupProductCounts(

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type", required = true)
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsRetailProductGroupProductCounts.CatalogType = kotlin.String.RETAIL,

    @get:DecimalMin(value="0")
    @Schema(required = true, description = "")
    @param:JsonProperty("in_stock", required = true)
    @get:JsonProperty("in_stock", required = true) val inStock: java.math.BigDecimal,

    @get:DecimalMin(value="0")
    @Schema(required = true, description = "")
    @param:JsonProperty("out_of_stock", required = true)
    @get:JsonProperty("out_of_stock", required = true) val outOfStock: java.math.BigDecimal,

    @get:DecimalMin(value="0")
    @Schema(required = true, description = "")
    @param:JsonProperty("preorder", required = true)
    @get:JsonProperty("preorder", required = true) val preorder: java.math.BigDecimal,

    @get:DecimalMin(value="0")
    @Schema(required = true, description = "")
    @param:JsonProperty("total", required = true)
    @get:JsonProperty("total", required = true) val total: java.math.BigDecimal,

    @get:DecimalMin(value="0")
    @Schema(description = "")
    @param:JsonProperty("videos")
    @get:JsonProperty("videos") val videos: java.math.BigDecimal? = null
) : CatalogsProductGroupProductCountsVertical {

    /**
    * 
    * Values: RETAIL
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        RETAIL("RETAIL");
    
        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CatalogType {
                return values().firstOrNull{ it.value == value }
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogType'")
            }
        }
    }

}

