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
 * @param success Returns true if the notification accepted.
 * @param receivedAt Received time. Unix timestamp in seconds.
 * @param errorMsg error message when success is false
 */
data class NotificationResponse(

    @Schema(example = "false", description = "Returns true if the notification accepted.")
    @get:JsonProperty("success") val success: kotlin.Boolean? = null,

    @Schema(example = "1677003860", description = "Received time. Unix timestamp in seconds.")
    @get:JsonProperty("received_at") val receivedAt: kotlin.Int? = null,

    @Schema(example = "null", description = "error message when success is false")
    @get:JsonProperty("error_msg") val errorMsg: kotlin.String? = null
) {

}

