@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateInvitesResultsResponseArray(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<InviteActionResultItem>? = null,

)
