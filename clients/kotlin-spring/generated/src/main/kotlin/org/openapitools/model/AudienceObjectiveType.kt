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
* Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
* Values: AWARENESS,CONSIDERATION,WEB_CONVERSION,CATALOG_SALES,VIDEO_COMPLETION,SALES
*/
enum class AudienceObjectiveType(@get:JsonValue val value: kotlin.String) {

    AWARENESS("AWARENESS"),
    CONSIDERATION("CONSIDERATION"),
    WEB_CONVERSION("WEB_CONVERSION"),
    CATALOG_SALES("CATALOG_SALES"),
    VIDEO_COMPLETION("VIDEO_COMPLETION"),
    SALES("SALES");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): AudienceObjectiveType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AudienceObjectiveType'")
        }
    }
}

