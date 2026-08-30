@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateAssetInvitesRequest(
    @field:JsonProperty("invites")
    val invites: kotlin.collections.List<CreateAssetInvitesRequestItem>,

)
