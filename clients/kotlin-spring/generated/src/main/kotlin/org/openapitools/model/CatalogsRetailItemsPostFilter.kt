package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * 
 * @param catalogType 
 * @param itemIds 
 * @param catalogId Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
 */
data class CatalogsRetailItemsPostFilter(

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsRetailItemsPostFilter.CatalogType = kotlin.String.RETAIL,

    @get:Size(min=1,max=1000) 
    @Schema(required = true, description = "")
    @param:JsonProperty("item_ids")
    @get:JsonProperty("item_ids", required = true) val itemIds: kotlin.collections.List<kotlin.String>,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("catalog_id")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null
) : CatalogsItemsPostFilters {

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
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogType'")
            }
        }
    }

}

