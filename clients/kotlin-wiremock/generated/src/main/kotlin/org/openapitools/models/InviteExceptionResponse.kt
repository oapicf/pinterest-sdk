@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class InviteExceptionResponse(
    @field:JsonProperty("code")
    val code: kotlin.Int? = null,

    @field:JsonProperty("invite_or_request_id")
    val inviteOrRequestId: kotlin.String? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("users_or_partner_ids")
    val usersOrPartnerIds: kotlin.collections.List<kotlin.String>? = null,

)
