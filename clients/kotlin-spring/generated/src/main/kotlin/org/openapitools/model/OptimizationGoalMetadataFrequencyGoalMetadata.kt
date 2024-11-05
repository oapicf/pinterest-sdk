package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param frequency 
 * @param timerange User entity counts time range
 */
data class OptimizationGoalMetadataFrequencyGoalMetadata(

    @Schema(example = "null", description = "")
    @get:JsonProperty("frequency") val frequency: kotlin.Int? = null,

    @Schema(example = "DAY", description = "User entity counts time range")
    @get:JsonProperty("timerange") val timerange: OptimizationGoalMetadataFrequencyGoalMetadata.Timerange? = null
    ) {

    /**
    * User entity counts time range
    * Values: THIRTY_DAY,DAY,SEVEN_DAY,TWENTY_MINUTE,TEN_MINUTE,TWENTY_FOUR_HOUR
    */
    enum class Timerange(@get:JsonValue val value: kotlin.String) {

        THIRTY_DAY("THIRTY_DAY"),
        DAY("DAY"),
        SEVEN_DAY("SEVEN_DAY"),
        TWENTY_MINUTE("TWENTY_MINUTE"),
        TEN_MINUTE("TEN_MINUTE"),
        TWENTY_FOUR_HOUR("TWENTY_FOUR_HOUR");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Timerange {
                return values().first{it -> it.value == value}
            }
        }
    }

}

