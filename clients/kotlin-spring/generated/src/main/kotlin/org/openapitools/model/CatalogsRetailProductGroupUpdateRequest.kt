package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsProductGroupFiltersRequest
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
 * Request object for updating a retail product group.
 * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @param country 
 * @param description 
 * @param filters 
 * @param locale 
 * @param name Name of catalog product group
 */
data class CatalogsRetailProductGroupUpdateRequest(

    @Schema(required = true, description = "Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.")
    @param:JsonProperty("catalog_type")
    @get:JsonProperty("catalog_type", required = true) override val catalogType: CatalogsRetailProductGroupUpdateRequest.CatalogType = kotlin.String.RETAIL,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("country")
    @get:JsonProperty("country") val country: Country? = null,

    @Schema(description = "")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("filters")
    @get:JsonProperty("filters") val filters: CatalogsProductGroupFiltersRequest? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("locale")
    @get:JsonProperty("locale") val locale: CatalogsLocale? = null,

    @Schema(example = "Most Popular", description = "Name of catalog product group")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null
) : CatalogsVerticalProductGroupUpdateRequest {

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

