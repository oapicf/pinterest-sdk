@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CancelInvitesRequest(
    @field:JsonProperty("invite_ids")
    val inviteIds: kotlin.collections.List<kotlin.String>,

)
