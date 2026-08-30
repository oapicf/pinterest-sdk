package org.openapitools.server.api.model

import org.openapitools.server.api.model.AuthRespondInviteAction
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuthRespondInvitesBodyItem(
    val action: AuthRespondInviteAction,
    /** Unique identifier of an invite. */
    val inviteId: kotlin.String
)
