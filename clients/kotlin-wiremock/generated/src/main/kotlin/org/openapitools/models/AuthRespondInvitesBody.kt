@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuthRespondInvitesBody(
    @field:JsonProperty("invites")
    val invites: kotlin.collections.List<AuthRespondInvitesBodyItem>,

)
