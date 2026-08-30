package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsProductGroupFilters
import org.openapitools.model.Country
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
 * Request object to list products for a given retail catalog_id and product group filter.
 * @param catalogId Catalog ID pertaining to the product group.
 * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @param country 
 * @param filters 
 * @param locale 
 */
data class CatalogsRetailListProductsByCatalogBasedFilterRequest(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog ID pertaining to the product group.")
    @param:JsonProperty("catalog_id")
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String,

    @Schema(required = true, description = "Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsRetailListProductsByCatalogBasedFilterRequest.CatalogType = kotlin.String.RETAIL,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("country")
    @get:JsonProperty("country", required = true) val country: Country,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("filters")
    @get:JsonProperty("filters", required = true) val filters: CatalogsProductGroupFilters,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("locale")
    @get:JsonProperty("locale", required = true) val locale: CatalogsLocale
) : CatalogsVerticalsListProductsByCatalogBasedFilterRequest {

    /**
    * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
    * Values: RETAIL
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        RETAIL("RETAIL");

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

