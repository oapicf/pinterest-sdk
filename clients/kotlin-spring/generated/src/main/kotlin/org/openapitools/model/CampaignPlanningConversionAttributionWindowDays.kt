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
* Conversion attribution window in days.
* Values: DAYS_0,DAYS_1,DAYS_7,DAYS_30,DAYS_60
*/
enum class CampaignPlanningConversionAttributionWindowDays(@get:JsonValue val value: kotlin.String) {

    DAYS_0("DAYS_0"),
    DAYS_1("DAYS_1"),
    DAYS_7("DAYS_7"),
    DAYS_30("DAYS_30"),
    DAYS_60("DAYS_60");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CampaignPlanningConversionAttributionWindowDays {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CampaignPlanningConversionAttributionWindowDays'")
        }
    }
}

