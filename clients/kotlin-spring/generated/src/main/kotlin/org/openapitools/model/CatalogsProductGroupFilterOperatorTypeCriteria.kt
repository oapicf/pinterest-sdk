package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.FilterOperatorType
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
 * 
 * @param propertyValues 
 * @param filterOperatorType 
 * @param negated 
 */
data class CatalogsProductGroupFilterOperatorTypeCriteria(

    @Schema(required = true, description = "")
    @param:JsonProperty("values", required = true)
    @get:JsonProperty("values", required = true) val propertyValues: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("filter_operator_type")
    @get:JsonProperty("filter_operator_type") val filterOperatorType: FilterOperatorType? = null,

    @Schema(description = "")
    @param:JsonProperty("negated")
    @get:JsonProperty("negated") val negated: kotlin.Boolean? = null
) {

}

