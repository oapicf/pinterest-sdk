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
 * @param code Error code associated with the error in requesting asset access.
 * @param messages 
 */
data class AssetAccessRequestError(

    @Schema(description = "Error code associated with the error in requesting asset access.")
    @param:JsonProperty("code")
    @get:JsonProperty("code") val code: kotlin.Int? = null,

    @Schema(description = "")
    @param:JsonProperty("messages")
    @get:JsonProperty("messages") val messages: kotlin.collections.List<kotlin.String>? = null
) {

}

