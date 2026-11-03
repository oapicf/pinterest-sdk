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
 * @param webhookUrl Standard HTTPS webhook URL.
 * @param leadFormId Lead form ID.
 */
data class LeadSubscriptionCreate(

    @Schema(required = true, description = "Standard HTTPS webhook URL.")
    @param:JsonProperty("webhook_url", required = true)
    @get:JsonProperty("webhook_url", required = true) val webhookUrl: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Lead form ID.")
    @param:JsonProperty("lead_form_id")
    @get:JsonProperty("lead_form_id") val leadFormId: kotlin.String? = null
) {

}

