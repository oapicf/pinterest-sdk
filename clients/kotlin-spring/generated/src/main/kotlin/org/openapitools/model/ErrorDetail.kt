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
 * @param count Number of records with this error
 * @param errorCode Numeric error code
 * @param message Error message description
 */
data class ErrorDetail(

    @Schema(required = true, description = "Number of records with this error")
    @param:JsonProperty("count")
    @get:JsonProperty("count", required = true) val count: kotlin.Int,

    @Schema(required = true, description = "Numeric error code")
    @param:JsonProperty("error_code")
    @get:JsonProperty("error_code", required = true) val errorCode: kotlin.Int,

    @Schema(required = true, description = "Error message description")
    @param:JsonProperty("message")
    @get:JsonProperty("message", required = true) val message: kotlin.String
) {

}

