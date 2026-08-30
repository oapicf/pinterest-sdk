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
* Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
* Values: PROCESSING,READY,TOO_SMALL,UPLOADING
*/
enum class CustomerListStatus(@get:JsonValue val value: kotlin.String) {

    PROCESSING("PROCESSING"),
    READY("READY"),
    TOO_SMALL("TOO_SMALL"),
    UPLOADING("UPLOADING");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CustomerListStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CustomerListStatus'")
        }
    }
}

