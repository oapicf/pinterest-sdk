@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class InviteDataResponse(
    @field:JsonProperty("invite_expiration")
    val inviteExpiration: kotlin.Int? = null,

    @field:JsonProperty("invite_status")
    val inviteStatus: kotlin.String? = null,

    @field:JsonProperty("invite_type")
    val inviteType: kotlin.String? = null,

    @field:JsonProperty("last_updated_time")
    val lastUpdatedTime: kotlin.Int? = null,

    @field:JsonProperty("sent_at")
    val sentAt: kotlin.Int? = null,

)
