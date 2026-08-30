package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CancelInviteResultUser(
    /** Email of the business member/partner. */
    val email: kotlin.String? = null,
    /** Unique identifier of the business member/partner. */
    val id: kotlin.String? = null,
    /** Username of the business member/partner. */
    val username: kotlin.String? = null
)
