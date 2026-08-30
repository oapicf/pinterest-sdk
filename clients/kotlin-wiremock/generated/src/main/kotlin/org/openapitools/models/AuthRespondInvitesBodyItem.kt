@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuthRespondInvitesBodyItem(
    @field:JsonProperty("action")
    val action: AuthRespondInviteAction,

    @field:JsonProperty("invite_id")
    val inviteId: kotlin.String,

)
