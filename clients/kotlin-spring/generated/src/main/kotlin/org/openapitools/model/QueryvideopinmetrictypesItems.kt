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
* Values: IMPRESSION,SAVE,VIDEO_MRC_VIEW,VIDEO_AVG_WATCH_TIME,VIDEO_V50_WATCH_TIME,QUARTILE_95_PERCENT_VIEW,VIDEO_10S_VIEW,VIDEO_START,OUTBOUND_CLICK
*/
enum class QueryvideopinmetrictypesItems(@get:JsonValue val value: kotlin.String) {

    IMPRESSION("IMPRESSION"),
    SAVE("SAVE"),
    VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
    VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
    VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
    QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
    VIDEO_10S_VIEW("VIDEO_10S_VIEW"),
    VIDEO_START("VIDEO_START"),
    OUTBOUND_CLICK("OUTBOUND_CLICK");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): QueryvideopinmetrictypesItems {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'QueryvideopinmetrictypesItems'")
        }
    }
}

