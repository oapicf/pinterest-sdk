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
* Values: _18Minus24,_25Minus34,_35Minus44,_45Minus49,_50Minus54,_55Minus64,_65Plus
*/
enum class AgeTrendsBucket(@get:JsonValue val value: kotlin.String) {

    _18Minus24("18-24"),
    _25Minus34("25-34"),
    _35Minus44("35-44"),
    _45Minus49("45-49"),
    _50Minus54("50-54"),
    _55Minus64("55-64"),
    _65Plus("65+");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AgeTrendsBucket {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AgeTrendsBucket'")
        }
    }
}

