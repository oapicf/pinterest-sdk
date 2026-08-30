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
* Type of network connection.
* Values: wifi,cellular_2g,cellular_3g,cellular_4g,cellular_5g,cellular_6g,ethernet,unknown
*/
enum class NetworkType(@get:JsonValue val value: kotlin.String) {

    wifi("wifi"),
    cellular_2g("cellular_2g"),
    cellular_3g("cellular_3g"),
    cellular_4g("cellular_4g"),
    cellular_5g("cellular_5g"),
    cellular_6g("cellular_6g"),
    ethernet("ethernet"),
    unknown("unknown");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): NetworkType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'NetworkType'")
        }
    }
}

