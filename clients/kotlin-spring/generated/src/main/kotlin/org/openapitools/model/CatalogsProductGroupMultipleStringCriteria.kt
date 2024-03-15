package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param negated 
 */
data class CatalogsProductGroupMultipleStringCriteria(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("values", required = true) val propertyValues: kotlin.collections.List<kotlin.String>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("negated") val negated: kotlin.Boolean? = false
) {

}

