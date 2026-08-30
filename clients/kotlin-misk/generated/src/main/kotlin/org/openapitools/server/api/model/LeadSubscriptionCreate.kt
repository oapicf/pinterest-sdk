package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadSubscriptionCreate(
    /** Standard HTTPS webhook URL. */
    val webhookUrl: kotlin.String,
    /** Lead form ID. */
    val leadFormId: kotlin.String? = null
)
