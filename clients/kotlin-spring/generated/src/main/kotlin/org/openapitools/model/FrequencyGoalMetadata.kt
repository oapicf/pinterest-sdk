package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.FrequencyGoalMetadataTimerange
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
 * Frequency target can only be between 2 and 20
 * @param frequency 
 * @param timerange 
 */
data class FrequencyGoalMetadata(

    @get:Min(value=2)
    @get:Max(value=20)
    @Schema(description = "")
    @param:JsonProperty("frequency")
    @get:JsonProperty("frequency") val frequency: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("timerange")
    @get:JsonProperty("timerange") val timerange: FrequencyGoalMetadataTimerange? = null
) {

}

