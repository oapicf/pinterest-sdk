@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OperationType {
    @JsonProperty(value = "SHARE") SHARE,
    @JsonProperty(value = "REVOKE") REVOKE,
}
