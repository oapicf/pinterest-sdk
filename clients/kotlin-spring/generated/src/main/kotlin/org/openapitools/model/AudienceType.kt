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
* Audience type
* Values: CUSTOMER_LIST,VISITOR,ENGAGEMENT,ACTALIKE,PERSONA
*/
enum class AudienceType(@get:JsonValue val value: kotlin.String) {

    CUSTOMER_LIST("CUSTOMER_LIST"),
    VISITOR("VISITOR"),
    ENGAGEMENT("ENGAGEMENT"),
    ACTALIKE("ACTALIKE"),
    PERSONA("PERSONA");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AudienceType {
                return values().first{it -> it.value == value}
        }
    }
}

