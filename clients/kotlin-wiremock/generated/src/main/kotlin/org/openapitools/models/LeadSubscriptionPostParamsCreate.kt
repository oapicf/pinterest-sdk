@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LeadSubscriptionPostParamsCreate(
    @field:JsonProperty("webhook_url")
    val webhookUrl: kotlin.String,

    @field:JsonProperty("lead_form_id")
    val leadFormId: kotlin.String? = null,

    @field:JsonProperty("partner_access_token")
    val partnerAccessToken: kotlin.String? = null,

    @field:JsonProperty("partner_metadata")
    val partnerMetadata: PartnerMetadata? = null,

    @field:JsonProperty("partner_refresh_token")
    val partnerRefreshToken: kotlin.String? = null,

)
