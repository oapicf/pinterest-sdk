package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelProductGroupFilters
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
 * Request object for updating a hotel product group.
 * @param catalogType 
 * @param description 
 * @param filters 
 * @param name Name of catalog product group
 */
data class CatalogsHotelProductGroupUpdateRequest(

    @Schema(required = true, description = "")
    @param:JsonProperty("catalog_type", required = true)
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsHotelProductGroupUpdateRequest.CatalogType = kotlin.String.HOTEL,

    @Schema(description = "")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("filters")
    @get:JsonProperty("filters") val filters: CatalogsHotelProductGroupFilters? = null,

    @Schema(example = "Most Popular", description = "Name of catalog product group")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null
) : CatalogsVerticalProductGroupUpdateRequest {

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
                return values().firstOrNull{ it.value == value }
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CatalogType'")
            }
        }
    }

}

