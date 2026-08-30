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
* Fields that can be updated in campaign bid options.
* Values: AUDIENCE,APP_TYPE,PLACEMENT,GENDER,AGE_BUCKET,FREQUENCY
*/
enum class CampaignBidOptionsUpdateMaskItems(@get:JsonValue val value: kotlin.String) {

    AUDIENCE("AUDIENCE"),
    APP_TYPE("APP_TYPE"),
    PLACEMENT("PLACEMENT"),
    GENDER("GENDER"),
    AGE_BUCKET("AGE_BUCKET"),
    FREQUENCY("FREQUENCY");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CampaignBidOptionsUpdateMaskItems {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CampaignBidOptionsUpdateMaskItems'")
        }
    }
}

