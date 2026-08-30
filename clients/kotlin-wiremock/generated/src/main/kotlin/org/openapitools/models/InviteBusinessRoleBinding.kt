@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class InviteBusinessRoleBinding(
    @field:JsonProperty("created_by_business_id")
    val createdByBusinessId: kotlin.String? = null,

    @field:JsonProperty("created_by_user_id")
    val createdByUserId: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("invite_data")
    val inviteData: InviteDataResponse? = null,

    @field:JsonProperty("is_received_invite")
    val isReceivedInvite: kotlin.Boolean? = null,

    @field:JsonProperty("user")
    val user: BusinessAccessUserSummary? = null,

)
