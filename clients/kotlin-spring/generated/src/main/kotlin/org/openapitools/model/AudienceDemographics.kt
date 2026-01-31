package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AudienceDemographicValue
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
 * Audience demographics
 * @param ages Ages distribution.
 * @param genders Gender distribution.
 * @param devices Device usage distribution.
 * @param metros Geographic metro area distribution.
 * @param countries Country area distribution.
 */
data class AudienceDemographics(

    @field:Valid
    @Schema(example = "null", description = "Ages distribution.")
    @get:JsonProperty("ages") val ages: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:Valid
    @Schema(example = "null", description = "Gender distribution.")
    @get:JsonProperty("genders") val genders: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:Valid
    @Schema(example = "null", description = "Device usage distribution.")
    @get:JsonProperty("devices") val devices: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:Valid
    @Schema(example = "null", description = "Geographic metro area distribution.")
    @get:JsonProperty("metros") val metros: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:Valid
    @Schema(example = "null", description = "Country area distribution.")
    @get:JsonProperty("countries") val countries: kotlin.collections.List<AudienceDemographicValue>? = null
) {

}

