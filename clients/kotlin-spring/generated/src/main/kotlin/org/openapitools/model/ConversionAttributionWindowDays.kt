package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
enum class ConversionAttributionWindowDays(val value: kotlin.Int) {

    @JsonProperty(0) _0(0),
    @JsonProperty(1) _1(1),
    @JsonProperty(7) _7(7),
    @JsonProperty(14) _14(14),
    @JsonProperty(30) _30(30),
    @JsonProperty(60) _60(60)
}

