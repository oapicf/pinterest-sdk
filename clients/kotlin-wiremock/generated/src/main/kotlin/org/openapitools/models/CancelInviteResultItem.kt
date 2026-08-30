@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CancelInviteResultItem(
    @field:JsonProperty("exception")
    val exception: CancelInviteException? = null,

    @field:JsonProperty("invite")
    val invite: CancelInviteResult? = null,

)
