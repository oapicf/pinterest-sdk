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
* Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. For update, only draft campaigns may update objective type.
* Values: AWARENESS,CONSIDERATION,VIDEO_VIEW,WEB_CONVERSION,CATALOG_SALES,WEB_SESSIONS,VIDEO_COMPLETION
*/
enum class ObjectiveType(@get:JsonValue val value: kotlin.String) {

    AWARENESS("AWARENESS"),
    CONSIDERATION("CONSIDERATION"),
    VIDEO_VIEW("VIDEO_VIEW"),
    WEB_CONVERSION("WEB_CONVERSION"),
    CATALOG_SALES("CATALOG_SALES"),
    WEB_SESSIONS("WEB_SESSIONS"),
    VIDEO_COMPLETION("VIDEO_COMPLETION");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ObjectiveType {
                return values().first{it -> it.value == value}
        }
    }
}

