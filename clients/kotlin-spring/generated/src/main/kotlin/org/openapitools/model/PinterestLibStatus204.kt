package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * The resource was successfully deleted.
 * @param statusCode 
 */
data class PinterestLibStatus204(

    @Schema(required = true, description = "")
    @param:JsonProperty("statusCode")
    @get:JsonProperty("statusCode", required = true) val statusCode: PinterestLibStatus204.StatusCode
) : CampaignAdPreviewDelete200ResponseInnerStatus {

    /**
    * 
    * Values: _204
    */
    enum class StatusCode(@get:JsonValue val value: java.math.BigDecimal) {

        _204("204");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: java.math.BigDecimal): StatusCode {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'StatusCode'")
            }
        }
    }

}

