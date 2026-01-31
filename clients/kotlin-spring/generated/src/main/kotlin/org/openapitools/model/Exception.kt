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
 * @param code Exception error code.
 * @param message Exception message.
 */
data class Exception(

    @Schema(example = "2", description = "Exception error code.")
    @get:JsonProperty("code") val code: kotlin.Int? = null,

    @Schema(example = "Advertiser not found.", description = "Exception message.")
    @get:JsonProperty("message") val message: kotlin.String? = null
) {

}

