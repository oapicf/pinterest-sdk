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
* The names of fields that business accounts are searched by
* Values: FULL_NAME,USERNAME,BUSINESS_ID,EMAIL
*/
enum class BusinessSearchBy(@get:JsonValue val value: kotlin.String) {

    FULL_NAME("FULL_NAME"),
    USERNAME("USERNAME"),
    BUSINESS_ID("BUSINESS_ID"),
    EMAIL("EMAIL");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): BusinessSearchBy {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BusinessSearchBy'")
        }
    }
}

