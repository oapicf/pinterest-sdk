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
 * @param &#x60;field&#x60; 
 * @param operation 
 * @param &#x60;value&#x60; 
 */
data class TargetingSpecOperationString(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("field", required = true) val `field`: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) val operation: TargetingSpecOperationString.Operation,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("value", required = true) val `value`: kotlin.String?
) {

    /**
    * 
    * Values: SET
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        SET("SET");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Operation {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TargetingSpecOperationString'")
            }
        }
    }

}

