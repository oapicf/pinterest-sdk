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
* Type of user conversion event.
* Values: add_to_cart,checkout,lead,signup
*/
enum class MsotEventName(@get:JsonValue val value: kotlin.String) {

    add_to_cart("add_to_cart"),
    checkout("checkout"),
    lead("lead"),
    signup("signup");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): MsotEventName {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MsotEventName'")
        }
    }
}

