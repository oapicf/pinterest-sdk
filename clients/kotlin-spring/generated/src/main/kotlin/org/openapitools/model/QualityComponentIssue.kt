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
 * Details of an issue with a quality component.
 * @param id Unique identifier for the issue check.
 * @param name Human-readable name of the issue.
 * @param reason Detailed reason for the issue.
 */
data class QualityComponentIssue(

    @Schema(example = "null", required = true, description = "Unique identifier for the issue check.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "Human-readable name of the issue.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "Detailed reason for the issue.")
    @get:JsonProperty("reason", required = true) val reason: kotlin.String
) {

}

