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
* Attribution model used to attribute the conversion event.
* Values: first_touch,last_touch,multi_touch,mmm
*/
enum class AttributionModel(@get:JsonValue val value: kotlin.String) {

    first_touch("first_touch"),
    last_touch("last_touch"),
    multi_touch("multi_touch"),
    mmm("mmm");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AttributionModel {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AttributionModel'")
        }
    }
}

