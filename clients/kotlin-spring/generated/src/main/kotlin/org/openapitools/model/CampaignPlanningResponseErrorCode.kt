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
* Error code returned for a campaign planning estimate failure.
* Values: SERVER_ERROR,AUDIENCE_LIST_MISSING,INVALID_REQUEST,PRODUCT_GROUP_MISSING
*/
enum class CampaignPlanningResponseErrorCode(@get:JsonValue val value: kotlin.String) {

    SERVER_ERROR("SERVER_ERROR"),
    AUDIENCE_LIST_MISSING("AUDIENCE_LIST_MISSING"),
    INVALID_REQUEST("INVALID_REQUEST"),
    PRODUCT_GROUP_MISSING("PRODUCT_GROUP_MISSING");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): CampaignPlanningResponseErrorCode {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'CampaignPlanningResponseErrorCode'")
        }
    }
}

