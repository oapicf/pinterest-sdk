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
* Advertiser campaign objective type. You can only update objectives for draft campaigns. `CTV_CONSIDERATION` is in BETA. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
* Values: AWARENESS,CONSIDERATION,WEB_CONVERSION,CATALOG_SALES,VIDEO_COMPLETION,SALES,APP_INSTALL,CTV_CONSIDERATION
*/
enum class ObjectiveType(@get:JsonValue val value: kotlin.String) {

    AWARENESS("AWARENESS"),
    CONSIDERATION("CONSIDERATION"),
    WEB_CONVERSION("WEB_CONVERSION"),
    CATALOG_SALES("CATALOG_SALES"),
    VIDEO_COMPLETION("VIDEO_COMPLETION"),
    SALES("SALES"),
    APP_INSTALL("APP_INSTALL"),
    CTV_CONSIDERATION("CTV_CONSIDERATION");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ObjectiveType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ObjectiveType'")
        }
    }
}

