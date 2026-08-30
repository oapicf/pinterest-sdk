package org.openapitools.server.api.model

import org.openapitools.server.api.model.BusinessAccessUserSummary
import org.openapitools.server.api.model.InviteAssetsSummary
import org.openapitools.server.api.model.InviteDataResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InviteResponse(
    val assetsSummary: InviteAssetsSummary? = null,
    /** The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. */
    val businessRoles: kotlin.collections.List<kotlin.String>? = null,
    /** Metadata for the business that created the invite/request. */
    val createdByBusiness: BusinessAccessUserSummary? = null,
    /** Metadata for the user that created the invite/request. */
    val createdByUser: BusinessAccessUserSummary? = null,
    /** The time the invite/request was created. Returned in milliseconds. */
    val createdTime: kotlin.Int? = null,
    /** Unique identifier of the invite/request. */
    val id: kotlin.String? = null,
    val inviteData: InviteDataResponse? = null,
    /** Indicates whether the invite/request was received. */
    val isReceivedInvite: kotlin.Boolean? = null,
    /** Metadata for the member/partner that was sent the invite/request. */
    val user: BusinessAccessUserSummary? = null
)
