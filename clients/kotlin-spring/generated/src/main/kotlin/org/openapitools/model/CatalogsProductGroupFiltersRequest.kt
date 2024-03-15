package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsProductGroupFilterKeys
import org.openapitools.model.CatalogsProductGroupFiltersRequestAnyOf
import org.openapitools.model.CatalogsProductGroupFiltersRequestAnyOf1
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
 * Object holding a group of filters for request on catalog product group. This is a distinct schema It is not possible to create or update a Product Group with empty filters. But some automatically generated Product Groups might have empty filters.
 * @param anyOf 
 * @param allOf 
 */
data class CatalogsProductGroupFiltersRequest(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("any_of", required = true) val anyOf: kotlin.collections.List<CatalogsProductGroupFilterKeys>,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("all_of", required = true) val allOf: kotlin.collections.List<CatalogsProductGroupFilterKeys>
) {

}

