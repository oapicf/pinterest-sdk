package org.openapitools.server.api.model

import org.openapitools.server.api.model.PartnerMetadata
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadSubscriptionPostParams(
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
    val webhookUrl: kotlin.String? = null,
    /** Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
    val partnerAccessToken: kotlin.String? = null,
    /** Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. */
    val partnerMetadata: PartnerMetadata? = null,
    /** Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
    val partnerRefreshToken: kotlin.String? = null
)
