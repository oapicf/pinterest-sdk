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
 * @param AD_ID The ID of the ad that this metrics belongs to.
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 */
data class AdsAnalyticsResponseInner(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", required = true, description = "The ID of the ad that this metrics belongs to.")
    @get:JsonProperty("AD_ID", required = true) val AD_ID: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
    @get:JsonProperty("DATE") val DATE: java.time.LocalDate? = null
) : kotlin.collections.HashMap<String, kotlin.Any>{

}

