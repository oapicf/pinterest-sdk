package org.openapitools.model

import java.util.Objects
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
 * Request object for updating a hotel product group.
 * @param catalogType 
 * @param name 
 * @param description 
 * @param filters 
 */
data class CatalogsHotelProductGroupUpdateRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("catalog_type") val catalogType: CatalogsHotelProductGroupUpdateRequest.CatalogType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("filters") val filters: CatalogsHotelProductGroupFilters? = null
) {

    /**
    * 
    * Values: HOTEL
    */
    enum class CatalogType(val value: kotlin.String) {

        @JsonProperty("HOTEL") HOTEL("HOTEL")
    }

}

