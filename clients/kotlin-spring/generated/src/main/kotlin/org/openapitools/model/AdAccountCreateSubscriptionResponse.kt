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
 * @param id Subscription ID.
 * @param cryptographicKey Base64 encoded key for client to decrypt lead data.
 * @param cryptographicAlgorithm Lead data encryption algorithm.
 * @param createdTime Subscription creation time. Unix timestamp in milliseconds.
 */
data class AdAccountCreateSubscriptionResponse(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "8078432025948590686", description = "Subscription ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54", description = "Base64 encoded key for client to decrypt lead data.")
    @get:JsonProperty("cryptographic_key") val cryptographicKey: kotlin.String? = null,

    @Schema(example = "AES-256-GCM", description = "Lead data encryption algorithm.")
    @get:JsonProperty("cryptographic_algorithm") val cryptographicAlgorithm: kotlin.String? = null,

    @Schema(example = "1699209842000", description = "Subscription creation time. Unix timestamp in milliseconds.")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null
    ) {

}

