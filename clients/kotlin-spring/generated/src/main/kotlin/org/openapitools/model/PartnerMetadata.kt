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
 * @param subscriberKey Text field value that uniquely identifies a subscriber.
 */
data class PartnerMetadata(

    @Schema(description = "Text field value that uniquely identifies a subscriber.")
    @param:JsonProperty("subscriber_key")
    @get:JsonProperty("subscriber_key") val subscriberKey: kotlin.String? = null
) {

}

