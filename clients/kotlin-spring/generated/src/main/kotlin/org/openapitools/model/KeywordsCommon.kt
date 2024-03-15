package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MatchTypeResponse
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
 * @param matchType 
 * @param &#x60;value&#x60; Keyword value (120 chars max).
 * @param bid Keyword custom bid in microcurrency - null if inherited from parent ad group.
 */
data class KeywordsCommon(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("match_type", required = true) val matchType: MatchTypeResponse?,

    @Schema(example = "null", required = true, description = "Keyword value (120 chars max).")
    @get:JsonProperty("value", required = true) val `value`: kotlin.String,

    @Schema(example = "200000", description = "Keyword custom bid in microcurrency - null if inherited from parent ad group.")
    @get:JsonProperty("bid") val bid: kotlin.Int? = null
) {

}

