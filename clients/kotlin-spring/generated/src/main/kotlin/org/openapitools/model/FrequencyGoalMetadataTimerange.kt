package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
* Values: THIRTY_DAY,DAY,SEVEN_DAY,TWENTY_MINUTE,TEN_MINUTE,TWENTY_FOUR_HOUR
*/
enum class FrequencyGoalMetadataTimerange(@get:JsonValue val value: kotlin.String) {

    THIRTY_DAY("THIRTY_DAY"),
    DAY("DAY"),
    SEVEN_DAY("SEVEN_DAY"),
    TWENTY_MINUTE("TWENTY_MINUTE"),
    TEN_MINUTE("TEN_MINUTE"),
    TWENTY_FOUR_HOUR("TWENTY_FOUR_HOUR");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): FrequencyGoalMetadataTimerange {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'FrequencyGoalMetadataTimerange'")
        }
    }
}

