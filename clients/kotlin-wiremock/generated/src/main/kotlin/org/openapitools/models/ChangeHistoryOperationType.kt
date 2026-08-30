@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ChangeHistoryOperationType {
    @JsonProperty(value = "CREATE") CREATE,
    @JsonProperty(value = "UPDATE") UPDATE,
    @JsonProperty(value = "DELETE") DELETE,
}
