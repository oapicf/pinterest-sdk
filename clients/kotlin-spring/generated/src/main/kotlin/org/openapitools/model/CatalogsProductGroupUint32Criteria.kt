package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.NumericFilterOperatorType
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
 * @param `operator` 
 * @param `value` 
 * @param negated 
 */
data class CatalogsProductGroupUint32Criteria(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("operator", required = true)
    @get:JsonProperty("operator", required = true) val `operator`: NumericFilterOperatorType,

    @get:Min(value=0)
    @get:Max(value=4294967295)
    @Schema(required = true, description = "")
    @param:JsonProperty("value", required = true)
    @get:JsonProperty("value", required = true) val `value`: kotlin.Int,

    @Schema(description = "")
    @param:JsonProperty("negated")
    @get:JsonProperty("negated") val negated: kotlin.Boolean? = null
) {

}

