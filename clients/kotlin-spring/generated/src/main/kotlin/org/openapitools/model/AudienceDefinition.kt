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
 * Queryable audience representation.
 * @param date Generation date
 * @param scope 
 * @param type 
 */
data class AudienceDefinition(

    @Schema(example = "2022-10-09", description = "Generation date")
    @get:JsonProperty("date") val date: kotlin.String? = null,

    @Schema(example = "PARTNER", description = "")
    @get:JsonProperty("scope") val scope: kotlin.String? = null,

    @Schema(example = "IMPRESSION_PLUS_ENGAGEMENT", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null
) {

}

