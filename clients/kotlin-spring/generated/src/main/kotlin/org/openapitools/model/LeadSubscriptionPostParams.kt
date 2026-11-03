package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param adAccountId The Ad Account ID that this lead form belongs to.
 * @param apiVersion API version.
 * @param createdTime Subscription creation time. Unix timestamp in milliseconds.
 * @param cryptographicAlgorithm Lead data encryption algorithm.
 * @param cryptographicKey Base64 encoded key for client to decrypt lead data.
 * @param id Subscription ID.
 * @param leadFormId Lead form ID.
 * @param userAccountId User account used to subscribe lead data.
 * @param webhookUrl Standard HTTPS webhook URL.
 * @param partnerAccessToken Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
 * @param partnerMetadata Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 * @param partnerRefreshToken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
 */
data class LeadSubscriptionPostParams(

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "The Ad Account ID that this lead form belongs to.")
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(description = "API version.")
    @param:JsonProperty("api_version")
    @get:JsonProperty("api_version") val apiVersion: kotlin.String? = null,

    @Schema(description = "Subscription creation time. Unix timestamp in milliseconds.")
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @Schema(description = "Lead data encryption algorithm.")
    @param:JsonProperty("cryptographic_algorithm")
    @get:JsonProperty("cryptographic_algorithm") val cryptographicAlgorithm: kotlin.String? = null,

    @Schema(description = "Base64 encoded key for client to decrypt lead data.")
    @param:JsonProperty("cryptographic_key")
    @get:JsonProperty("cryptographic_key") val cryptographicKey: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Subscription ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Lead form ID.")
    @param:JsonProperty("lead_form_id")
    @get:JsonProperty("lead_form_id") val leadFormId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "User account used to subscribe lead data.")
    @param:JsonProperty("user_account_id")
    @get:JsonProperty("user_account_id") val userAccountId: kotlin.String? = null,

    @Schema(description = "Standard HTTPS webhook URL.")
    @param:JsonProperty("webhook_url")
    @get:JsonProperty("webhook_url") val webhookUrl: kotlin.String? = null,

    @Schema(description = "Partner access token. Only for clients that requires authentication. We recommend to avoid this param.")
    @param:JsonProperty("partner_access_token")
    @get:JsonProperty("partner_access_token") val partnerAccessToken: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.")
    @param:JsonProperty("partner_metadata")
    @get:JsonProperty("partner_metadata") val partnerMetadata: PartnerMetadata? = null,

    @Schema(description = "Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.")
    @param:JsonProperty("partner_refresh_token")
    @get:JsonProperty("partner_refresh_token") val partnerRefreshToken: kotlin.String? = null
) {

}

