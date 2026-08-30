package org.openapitools.server.api.model

import org.openapitools.server.api.model.RespondToInviteResultItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RespondToInvitesResponseArray(
    /** List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned. */
    val items: kotlin.collections.List<RespondToInviteResultItem>? = null
)
