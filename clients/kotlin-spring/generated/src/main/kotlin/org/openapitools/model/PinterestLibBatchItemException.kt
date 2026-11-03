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
 * Exception details for a batch operation item.
 * @param message 
 * @param code 
 */
data class PinterestLibBatchItemException(

    @Schema(example = "Advertiser not found.", required = true, description = "")
    @param:JsonProperty("message", required = true)
    @get:JsonProperty("message", required = true) val message: kotlin.String,

    @Schema(example = "2", description = "")
    @param:JsonProperty("code")
    @get:JsonProperty("code") val code: kotlin.Int? = null
) {

}

