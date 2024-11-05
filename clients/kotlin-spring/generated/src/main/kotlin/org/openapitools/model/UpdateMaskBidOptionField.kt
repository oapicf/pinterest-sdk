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
* bid option field to apply operation updates to
* Values: BID,APP_TYPE_BID_MULTIPLIER_SET,PLACEMENT_BID_MULTIPLIER_SET
*/
enum class UpdateMaskBidOptionField(@get:JsonValue val value: kotlin.String) {

    BID("BID"),
    APP_TYPE_BID_MULTIPLIER_SET("APP_TYPE_BID_MULTIPLIER_SET"),
    PLACEMENT_BID_MULTIPLIER_SET("PLACEMENT_BID_MULTIPLIER_SET");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): UpdateMaskBidOptionField {
                return values().first{it -> it.value == value}
        }
    }
}

