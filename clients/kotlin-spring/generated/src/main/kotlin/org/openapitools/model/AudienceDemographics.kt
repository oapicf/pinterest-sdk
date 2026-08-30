package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param countries Country area distribution.
 * @param devices Device usage distribution.
 * @param genders Gender distribution.
 * @param metros Geographic metro area distribution.
 */
data class AudienceDemographics(

    @field:Valid
    @Schema(description = "Ages distribution.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ages")
    @get:JsonProperty("ages") val ages: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:Valid
    @Schema(description = "Country area distribution.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("countries")
    @get:JsonProperty("countries") val countries: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:Valid
    @Schema(description = "Device usage distribution.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("devices")
    @get:JsonProperty("devices") val devices: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:Valid
    @Schema(description = "Gender distribution.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("genders")
    @get:JsonProperty("genders") val genders: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:Valid
    @Schema(description = "Geographic metro area distribution.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("metros")
    @get:JsonProperty("metros") val metros: kotlin.collections.List<AudienceDemographicValue>? = null
) {

}

