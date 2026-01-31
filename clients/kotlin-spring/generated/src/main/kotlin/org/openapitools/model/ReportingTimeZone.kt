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
* [Closed beta](/docs/getting-started/using-beta-and-restricted-features/) Specify the timezone to be applied for the reporting.
* Values: PINTEREST_TIME_ZONE,AD_ACCOUNT_TIME_ZONE
*/
enum class ReportingTimeZone(@get:JsonValue val value: kotlin.String) {

    PINTEREST_TIME_ZONE("PINTEREST_TIME_ZONE"),
    AD_ACCOUNT_TIME_ZONE("AD_ACCOUNT_TIME_ZONE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): ReportingTimeZone {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ReportingTimeZone'")
        }
    }
}

