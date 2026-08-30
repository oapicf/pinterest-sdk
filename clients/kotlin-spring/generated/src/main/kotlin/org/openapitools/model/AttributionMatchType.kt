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
* Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
* Values: P,D,NA
*/
enum class AttributionMatchType(@get:JsonValue val value: kotlin.String) {

    P("P"),
    D("D"),
    NA("NA");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AttributionMatchType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AttributionMatchType'")
        }
    }
}

