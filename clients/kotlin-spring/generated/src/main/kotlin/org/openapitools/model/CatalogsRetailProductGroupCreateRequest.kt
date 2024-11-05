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
 * Request object for creating a product group.
 * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @param name 
 * @param filters 
 * @param catalogId Catalog id pertaining to the retail product group.
 * @param country 
 * @param locale 
 * @param description 
 */
data class CatalogsRetailProductGroupCreateRequest(

    @Schema(example = "null", required = true, description = "Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsRetailProductGroupCreateRequest.CatalogType,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("filters", required = true) val filters: CatalogsProductGroupFiltersRequest,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog id pertaining to the retail product group.")
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("country", required = true) val country: Country,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("locale", required = true) val locale: CatalogsLocale,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null
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

