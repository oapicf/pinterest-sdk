package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsItemsPostFilters
import org.openapitools.model.CatalogsItemsRequestLanguage
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
 * Request object of catalogs items
 * @param country 
 * @param language 
 * @param filters 
 */
data class CatalogsItemsRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("country", required = true) val country: Country,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("language", required = true) val language: CatalogsItemsRequestLanguage,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("filters", required = true) val filters: CatalogsItemsPostFilters
    ) {

}

