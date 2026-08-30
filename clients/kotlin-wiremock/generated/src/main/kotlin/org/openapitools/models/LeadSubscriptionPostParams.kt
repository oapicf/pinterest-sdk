@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LeadSubscriptionPostParams(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("api_version")
    val apiVersion: kotlin.String? = null,

    @field:JsonProperty("created_time")
    val createdTime: kotlin.Int? = null,

    @field:JsonProperty("cryptographic_algorithm")
    val cryptographicAlgorithm: kotlin.String? = null,

    @field:JsonProperty("cryptographic_key")
    val cryptographicKey: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("lead_form_id")
    val leadFormId: kotlin.String? = null,

    @field:JsonProperty("user_account_id")
    val userAccountId: kotlin.String? = null,

    @field:JsonProperty("webhook_url")
    val webhookUrl: kotlin.String? = null,

    @field:JsonProperty("partner_access_token")
    val partnerAccessToken: kotlin.String? = null,

    @field:JsonProperty("partner_metadata")
    val partnerMetadata: PartnerMetadata? = null,

    @field:JsonProperty("partner_refresh_token")
    val partnerRefreshToken: kotlin.String? = null,

)
