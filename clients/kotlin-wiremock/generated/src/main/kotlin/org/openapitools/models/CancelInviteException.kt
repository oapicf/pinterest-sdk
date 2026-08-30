@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CancelInviteException(
    @field:JsonProperty("invite_id")
    val inviteId: kotlin.String? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

)
