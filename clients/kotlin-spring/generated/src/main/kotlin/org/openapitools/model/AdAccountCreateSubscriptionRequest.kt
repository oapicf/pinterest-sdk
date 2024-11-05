package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdAccountCreateSubscriptionRequestPartnerMetadata
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
 * @param partnerAccessToken Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
 * @param partnerRefreshToken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
 * @param partnerMetadata 
 */
data class AdAccountCreateSubscriptionRequest(

    @Schema(example = "https://webhook.example.com/xyz", required = true, description = "Standard HTTPS webhook URL.")
    @get:JsonProperty("webhook_url", required = true) val webhookUrl: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426390", description = "Lead form ID.")
    @get:JsonProperty("lead_form_id") val leadFormId: kotlin.String? = null,

    @Schema(example = "null", description = "Partner access token. Only for clients that requires authentication. We recommend to avoid this param.")
    @get:JsonProperty("partner_access_token") val partnerAccessToken: kotlin.String? = null,

    @Schema(example = "null", description = "Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.")
    @get:JsonProperty("partner_refresh_token") val partnerRefreshToken: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("partner_metadata") val partnerMetadata: AdAccountCreateSubscriptionRequestPartnerMetadata? = null
    ) {

}

