@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TokenTypeHint {
    @JsonProperty(value = "access_token") access_token,
    @JsonProperty(value = "refresh_token") refresh_token,
}
