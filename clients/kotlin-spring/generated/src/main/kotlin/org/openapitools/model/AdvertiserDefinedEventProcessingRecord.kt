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
 * Processing record for an advertiser defined event operation
 * @param name Name of the advertiser defined event
 * @param status Processing status (success or failure)
 * @param exceptions List of exception messages if the operation failed
 */
data class AdvertiserDefinedEventProcessingRecord(

    @Schema(example = "newsletter_signup", required = true, description = "Name of the advertiser defined event")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "success", required = true, description = "Processing status (success or failure)")
    @param:JsonProperty("status", required = true)
    @get:JsonProperty("status", required = true) val status: kotlin.String,

    @Schema(description = "List of exception messages if the operation failed")
    @param:JsonProperty("exceptions")
    @get:JsonProperty("exceptions") val exceptions: kotlin.collections.List<kotlin.String>? = null
) {

}

