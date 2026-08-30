package org.openapitools.server.api.model

import org.openapitools.server.api.model.BusinessRoleForInvite
import org.openapitools.server.api.model.InviteType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateMembershipOrPartnershipInvitesBody(
    val businessRole: BusinessRoleForInvite,
    val inviteType: InviteType,
    /** A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE */
    val members: kotlin.collections.List<kotlin.String>? = null,
    /** A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST */
    val partners: kotlin.collections.List<kotlin.String>? = null
)
