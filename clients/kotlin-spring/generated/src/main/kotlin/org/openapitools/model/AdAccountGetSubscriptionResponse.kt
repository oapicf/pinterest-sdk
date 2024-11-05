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
 * @param leadFormId Lead form ID.
 * @param webhookUrl Standard HTTPS webhook URL.
 * @param id Subscription ID.
 * @param userAccountId User account used to subscribe lead data.
 * @param adAccountId The Ad Account ID that this lead form belongs to.
 * @param apiVersion API version.
 * @param cryptographicKey Base64 encoded key for client to decrypt lead data.
 * @param cryptographicAlgorithm Lead data encryption algorithm.
 * @param createdTime Lead form creation time. Unix timestamp in milliseconds.
 */
data class AdAccountGetSubscriptionResponse(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426390", description = "Lead form ID.")
    @get:JsonProperty("lead_form_id") val leadFormId: kotlin.String? = null,

    @Schema(example = "https://webhook.example.com/xyz", description = "Standard HTTPS webhook URL.")
    @get:JsonProperty("webhook_url") val webhookUrl: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "8078432025948590686", description = "Subscription ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "User account used to subscribe lead data.")
    @get:JsonProperty("user_account_id") val userAccountId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885176", description = "The Ad Account ID that this lead form belongs to.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "v5", description = "API version.")
    @get:JsonProperty("api_version") val apiVersion: kotlin.String? = null,

    @Schema(example = "ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54", description = "Base64 encoded key for client to decrypt lead data.")
    @get:JsonProperty("cryptographic_key") val cryptographicKey: kotlin.String? = null,

    @Schema(example = "AES-256-GCM", description = "Lead data encryption algorithm.")
    @get:JsonProperty("cryptographic_algorithm") val cryptographicAlgorithm: kotlin.String? = null,

    @Schema(example = "1699209842000", description = "Lead form creation time. Unix timestamp in milliseconds.")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null
    ) {

}

