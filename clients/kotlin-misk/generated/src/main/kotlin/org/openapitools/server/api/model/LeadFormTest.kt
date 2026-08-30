package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadFormTest(
    /** Subscription ID. */
    val subscriptionId: kotlin.String? = null
)
