package org.openapitools.server.api.model

import org.openapitools.server.api.model.CancelInviteResultUser
import org.openapitools.server.api.model.InviteDataResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CancelInviteResult(
    val id: kotlin.String? = null,
    val inviteData: InviteDataResponse? = null,
    val isReceivedInvite: kotlin.Boolean? = null,
    val user: CancelInviteResultUser? = null
)
