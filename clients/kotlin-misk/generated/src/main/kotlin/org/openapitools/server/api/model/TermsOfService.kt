package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TermsOfService(
    /** The ID of the ad account. */
    val adAccountId: kotlin.String? = null,
    /** Whether the ad account has accepted terms of service. */
    val hasAccepted: kotlin.Boolean? = null,
    /** The terms of service content */
    val html: kotlin.String? = null,
    /** The ID of the terms of service */
    val id: kotlin.String? = null
)
