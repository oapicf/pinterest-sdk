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
 * Error which occurred when applying a bid options operation to a specific item.
 * @param code The error code for the item bid option operation validation error
 * @param message Message describing the item bid option operation validation error
 */
data class AdvancedAuctionOperationError(

    @Schema(example = "6", description = "The error code for the item bid option operation validation error")
    @get:JsonProperty("code") val code: kotlin.Int? = null,

    @Schema(example = "Bid in micro currency should be non-negative", description = "Message describing the item bid option operation validation error")
    @get:JsonProperty("message") val message: kotlin.String? = null
    ) {

}

