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
 * Lead form test action: submit sample answers and receive the resulting subscription id.
 * @param subscriptionId Subscription ID.
 */
data class LeadFormTest(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "8078432025948590686", readOnly = true, description = "Subscription ID.")
    @param:JsonProperty("subscription_id")
    @get:JsonProperty("subscription_id") val subscriptionId: kotlin.String? = null
) {

}

