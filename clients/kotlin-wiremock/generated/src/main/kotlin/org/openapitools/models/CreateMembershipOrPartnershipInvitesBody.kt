@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateMembershipOrPartnershipInvitesBody(
    @field:JsonProperty("business_role")
    val businessRole: BusinessRoleForInvite,

    @field:JsonProperty("invite_type")
    val inviteType: InviteType,

    @field:JsonProperty("members")
    val members: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("partners")
    val partners: kotlin.collections.List<kotlin.String>? = null,

)
