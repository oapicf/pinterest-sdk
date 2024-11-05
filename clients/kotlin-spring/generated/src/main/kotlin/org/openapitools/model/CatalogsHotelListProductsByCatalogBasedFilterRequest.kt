package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelProductGroupFilters
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
 * Request object to list products for a given hotel catalog_id and product group filter.
 * @param catalogType 
 * @param catalogId Catalog id pertaining to the hotel product group.
 * @param filters 
 */
data class CatalogsHotelListProductsByCatalogBasedFilterRequest(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsHotelListProductsByCatalogBasedFilterRequest.CatalogType,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog id pertaining to the hotel product group.")
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("filters", required = true) val filters: CatalogsHotelProductGroupFilters
    ) {

    /**
    * 
    * Values: HOTEL
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        HOTEL("HOTEL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CatalogType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

