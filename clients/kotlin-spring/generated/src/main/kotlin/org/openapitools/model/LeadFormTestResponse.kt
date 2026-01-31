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
 * Response for lead data test API.
 * @param subscriptionId Subscription ID.
 */
data class LeadFormTestResponse(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "8078432025948590686", description = "Subscription ID.")
    @get:JsonProperty("subscription_id") val subscriptionId: kotlin.String? = null
) {

}

