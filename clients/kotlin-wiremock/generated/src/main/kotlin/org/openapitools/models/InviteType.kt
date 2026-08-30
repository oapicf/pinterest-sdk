@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class InviteType {
    @JsonProperty(value = "MEMBER_INVITE") MEMBER_INVITE,
    @JsonProperty(value = "PARTNER_INVITE") PARTNER_INVITE,
    @JsonProperty(value = "PARTNER_REQUEST") PARTNER_REQUEST,
}
