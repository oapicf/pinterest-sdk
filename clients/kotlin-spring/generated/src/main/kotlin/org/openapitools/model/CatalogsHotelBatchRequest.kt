package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelBatchItem
import org.openapitools.model.CatalogsType
import org.openapitools.model.Country
import org.openapitools.model.Language
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
 * Request object to update catalogs hotel items
 * @param catalogType 
 * @param country 
 * @param language 
 * @param items Array with catalogs item operations
 * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 */
data class CatalogsHotelBatchRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsType,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("country", required = true) val country: Country,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("language", required = true) val language: Language,

    @field:Valid
    @get:Size(min=1,max=1000) 
    @Schema(example = "null", required = true, description = "Array with catalogs item operations")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<CatalogsHotelBatchItem>,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", description = "Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null
) {

}

