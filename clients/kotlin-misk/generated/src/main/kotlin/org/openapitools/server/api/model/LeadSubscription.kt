package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadSubscription(
    /** The Ad Account ID that this lead form belongs to. */
    val adAccountId: kotlin.String? = null,
    /** API version. */
    val apiVersion: kotlin.String? = null,
    /** Subscription creation time. Unix timestamp in milliseconds. */
    val createdTime: kotlin.Int? = null,
    /** Lead data encryption algorithm. */
    val cryptographicAlgorithm: kotlin.String? = null,
    /** Base64 encoded key for client to decrypt lead data. */
    val cryptographicKey: kotlin.String? = null,
    /** Subscription ID. */
    val id: kotlin.String? = null,
    /** Lead form ID. */
    val leadFormId: kotlin.String? = null,
    /** User account used to subscribe lead data. */
    val userAccountId: kotlin.String? = null,
    /** Standard HTTPS webhook URL. */
    val webhookUrl: kotlin.String? = null
)
