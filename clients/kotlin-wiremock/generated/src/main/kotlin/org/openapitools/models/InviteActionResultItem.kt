@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class InviteActionResultItem(
    @field:JsonProperty("exception")
    val exception: InviteExceptionResponse? = null,

    @field:JsonProperty("invite")
    val invite: InviteBusinessRoleBinding? = null,

)
