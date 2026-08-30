@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class RespondToInviteResultItem(
    @field:JsonProperty("exception")
    val exception: InviteExceptionResponse? = null,

    @field:JsonProperty("invite")
    val invite: BaseInviteDataResponse? = null,

)
