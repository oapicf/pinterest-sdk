package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsHotelProductGroupFilterKeys
import org.openapitools.model.CatalogsHotelProductGroupFiltersAllOf
import org.openapitools.model.CatalogsHotelProductGroupFiltersAnyOf
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
 * Object holding a group of filters for a hotel product group
 * @param anyOf 
 * @param allOf 
 */
data class CatalogsHotelProductGroupFilters(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("any_of", required = true) val anyOf: kotlin.collections.List<CatalogsHotelProductGroupFilterKeys>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("all_of", required = true) val allOf: kotlin.collections.List<CatalogsHotelProductGroupFilterKeys>
    ) {

}

