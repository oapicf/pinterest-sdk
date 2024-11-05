package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsProductGroupFiltersRequest
import org.openapitools.model.Country
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
 * Request object for updating a retail product group.
 * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @param name 
 * @param description 
 * @param filters 
 * @param country 
 * @param locale 
 */
data class CatalogsRetailProductGroupUpdateRequest(

    @Schema(example = "null", description = "Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.")
    @get:JsonProperty("catalog_type") val catalogType: CatalogsRetailProductGroupUpdateRequest.CatalogType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("filters") val filters: CatalogsProductGroupFiltersRequest? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("country") val country: Country? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("locale") val locale: CatalogsLocale? = null
    ) {

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
                return values().first{it -> it.value == value}
            }
        }
    }

}

