package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CancelInvitesRequest(
    /** A list of invite/request ids to cancel. */
    val inviteIds: kotlin.collections.List<kotlin.String>
)
