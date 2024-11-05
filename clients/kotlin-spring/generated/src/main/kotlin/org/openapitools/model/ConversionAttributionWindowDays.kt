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
* Values: _0,_1,_7,_14,_30,_60
*/
enum class ConversionAttributionWindowDays(@get:JsonValue val value: kotlin.Int) {

    _0(0),
    _1(1),
    _7(7),
    _14(14),
    _30(30),
    _60(60);

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.Int): ConversionAttributionWindowDays {
                return values().first{it -> it.value == value}
        }
    }
}

