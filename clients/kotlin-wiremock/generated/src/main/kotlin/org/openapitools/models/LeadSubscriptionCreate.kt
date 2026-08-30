@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LeadSubscriptionCreate(
    @field:JsonProperty("webhook_url")
    val webhookUrl: kotlin.String,

    @field:JsonProperty("lead_form_id")
    val leadFormId: kotlin.String? = null,

)
