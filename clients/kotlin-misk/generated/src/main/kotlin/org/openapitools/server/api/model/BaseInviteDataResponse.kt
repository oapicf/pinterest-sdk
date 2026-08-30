package org.openapitools.server.api.model

import org.openapitools.server.api.model.BusinessAccessUserSummary
import org.openapitools.server.api.model.InviteDataResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BaseInviteDataResponse(
    /** Unique identifier of the invite/request. */
    val id: kotlin.String? = null,
    val inviteData: InviteDataResponse? = null,
    /** Indicates whether the invite/request was received. */
    val isReceivedInvite: kotlin.Boolean? = null,
    /** Metadata for the member/partner that was sent the invite/request. */
    val user: BusinessAccessUserSummary? = null
)
