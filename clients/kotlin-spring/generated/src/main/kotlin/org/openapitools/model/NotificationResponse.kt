package org.openapitools.model

import java.util.Objects
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
 * @param errorMsg error message when success is false
 * @param receivedAt Received time. Unix timestamp in seconds.
 * @param success Returns true if the notification accepted.
 */
data class NotificationResponse(

    @Schema(description = "error message when success is false")
    @param:JsonProperty("error_msg")
    @get:JsonProperty("error_msg") val errorMsg: kotlin.String? = null,

    @Schema(description = "Received time. Unix timestamp in seconds.")
    @param:JsonProperty("received_at")
    @get:JsonProperty("received_at") val receivedAt: kotlin.Int? = null,

    @Schema(description = "Returns true if the notification accepted.")
    @param:JsonProperty("success")
    @get:JsonProperty("success") val success: kotlin.Boolean? = null
) {

}

