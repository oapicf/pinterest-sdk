package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "success", required = true, description = "Processing status (success or failure)")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: kotlin.String,

    @Schema(description = "List of exception messages if the operation failed")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("exceptions")
    @get:JsonProperty("exceptions") val exceptions: kotlin.collections.List<kotlin.String>? = null
) {

}

