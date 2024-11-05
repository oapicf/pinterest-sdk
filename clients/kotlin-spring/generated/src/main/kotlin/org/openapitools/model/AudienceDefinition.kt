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
 * @param type Generated audience type to request.
 * @param scope Generated audience scope to request.
 */
data class AudienceDefinition(

    @Schema(example = "2022-10-09", description = "Generation date")
    @get:JsonProperty("date") val date: kotlin.String? = null,

    @Schema(example = "null", description = "Generated audience type to request.")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "null", description = "Generated audience scope to request.")
    @get:JsonProperty("scope") val scope: kotlin.String? = null
    ) {

}

