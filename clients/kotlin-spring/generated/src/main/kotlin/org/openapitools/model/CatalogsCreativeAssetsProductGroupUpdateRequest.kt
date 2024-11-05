package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsProductGroupFilters
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
 * Request object for updating a creative assets product group.
 * @param catalogType 
 * @param name 
 * @param description 
 * @param filters 
 */
data class CatalogsCreativeAssetsProductGroupUpdateRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("catalog_type") val catalogType: CatalogsCreativeAssetsProductGroupUpdateRequest.CatalogType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("filters") val filters: CatalogsCreativeAssetsProductGroupFilters? = null
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

