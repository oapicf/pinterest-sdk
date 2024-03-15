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
 * Request object for creating a hotel product group.
 * @param catalogType 
 * @param name 
 * @param filters 
 * @param catalogId Catalog id pertaining to the hotel product group.
 * @param description 
 */
data class CatalogsHotelProductGroupCreateRequest(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsHotelProductGroupCreateRequest.CatalogType,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("filters", required = true) val filters: CatalogsHotelProductGroupFilters,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog id pertaining to the hotel product group.")
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null
) {

    /**
    * 
    * Values: HOTEL
    */
    enum class CatalogType(val value: kotlin.String) {

        @JsonProperty("HOTEL") HOTEL("HOTEL")
    }

}

