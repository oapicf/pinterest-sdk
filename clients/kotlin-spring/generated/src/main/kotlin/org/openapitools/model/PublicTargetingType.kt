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
* Public ad targeting type with external names
* Values: APPTYPE,GENDER,LOCALE,AGE_BUCKET,LOCATION,GEO,INTEREST,KEYWORD,AUDIENCE_INCLUDE,AUDIENCE_EXCLUDE
*/
enum class PublicTargetingType(@get:JsonValue val value: kotlin.String) {

    APPTYPE("APPTYPE"),
    GENDER("GENDER"),
    LOCALE("LOCALE"),
    AGE_BUCKET("AGE_BUCKET"),
    LOCATION("LOCATION"),
    GEO("GEO"),
    INTEREST("INTEREST"),
    KEYWORD("KEYWORD"),
    AUDIENCE_INCLUDE("AUDIENCE_INCLUDE"),
    AUDIENCE_EXCLUDE("AUDIENCE_EXCLUDE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): PublicTargetingType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PublicTargetingType'")
        }
    }
}

