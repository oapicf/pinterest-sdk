package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsFeedProcessingScheduleTimezone
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
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 * @param time A time in format HH:MM with leading 0 (zero)
 * @param timezone The timezone considered for the processing schedule time.
 */
data class CatalogsFeedProcessingSchedule(

    @get:Pattern(regexp="^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")
    @Schema(required = true, description = "A time in format HH:MM with leading 0 (zero)")
    @param:JsonProperty("time")
    @get:JsonProperty("time", required = true) val time: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "The timezone considered for the processing schedule time.")
    @param:JsonProperty("timezone")
    @get:JsonProperty("timezone", required = true) val timezone: CatalogsFeedProcessingScheduleTimezone?
) {

}

