package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.PartnerMetadata
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
 * @param partnerMetadata Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 * @param partnerRefreshToken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
 */
data class LeadSubscriptionPostParamsCreate(

    @Schema(required = true, description = "Standard HTTPS webhook URL.")
    @param:JsonProperty("webhook_url")
    @get:JsonProperty("webhook_url", required = true) val webhookUrl: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Lead form ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("lead_form_id")
    @get:JsonProperty("lead_form_id") val leadFormId: kotlin.String? = null,

    @Schema(description = "Partner access token. Only for clients that requires authentication. We recommend to avoid this param.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("partner_access_token")
    @get:JsonProperty("partner_access_token") val partnerAccessToken: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("partner_metadata")
    @get:JsonProperty("partner_metadata") val partnerMetadata: PartnerMetadata? = null,

    @Schema(description = "Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("partner_refresh_token")
    @get:JsonProperty("partner_refresh_token") val partnerRefreshToken: kotlin.String? = null
) {

}

