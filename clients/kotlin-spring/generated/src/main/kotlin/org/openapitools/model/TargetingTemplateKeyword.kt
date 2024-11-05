package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MatchType
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
 * @param &#x60;value&#x60; The keyword targeting (120 chars max).
 */
data class TargetingTemplateKeyword(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("match_type") val matchType: MatchType? = null,

    @Schema(example = "couples halloween costumes", description = "The keyword targeting (120 chars max).")
    @get:JsonProperty("value") val `value`: kotlin.String? = null
    ) {

}

