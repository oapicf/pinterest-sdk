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
* Whether the data is owned by the partner (1p) or by the data provider (3p)
* Values: _1p,_3p
*/
enum class AudienceDataParty(@get:JsonValue val value: kotlin.String) {

    _1p("1p"),
    _3p("3p");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AudienceDataParty {
                return values().first{it -> it.value == value}
        }
    }
}

