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
* Operating system family.
* Values: ios,android,macos,windows,linux,bsd,other
*/
enum class OsFamily(@get:JsonValue val value: kotlin.String) {

    ios("ios"),
    android("android"),
    macos("macos"),
    windows("windows"),
    linux("linux"),
    bsd("bsd"),
    other("other");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OsFamily {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OsFamily'")
        }
    }
}

