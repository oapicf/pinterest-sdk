@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TokenGrantType {
    @JsonProperty(value = "authorization_code") authorization_code,
    @JsonProperty(value = "refresh_token") refresh_token,
    @JsonProperty(value = "client_credentials") client_credentials,
}
