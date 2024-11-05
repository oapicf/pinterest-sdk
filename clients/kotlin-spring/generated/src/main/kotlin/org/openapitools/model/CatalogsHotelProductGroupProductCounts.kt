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
 * Product counts for a Hotel CatalogsProductGroup
 * @param catalogType 
 * @param total 
 */
data class CatalogsHotelProductGroupProductCounts(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsHotelProductGroupProductCounts.CatalogType,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("total", required = true) val total: java.math.BigDecimal
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

