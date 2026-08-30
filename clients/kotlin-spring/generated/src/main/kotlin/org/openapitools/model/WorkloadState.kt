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
* Workload processing state
* Values: NOT_STARTED,RUNNING,PAUSED,SUCCEEDED,FAILED
*/
enum class WorkloadState(@get:JsonValue val value: kotlin.String) {

    NOT_STARTED("NOT_STARTED"),
    RUNNING("RUNNING"),
    PAUSED("PAUSED"),
    SUCCEEDED("SUCCEEDED"),
    FAILED("FAILED");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): WorkloadState {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'WorkloadState'")
        }
    }
}

