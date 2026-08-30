@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class UserListOperationType {
    @JsonProperty(value = "ADD") ADD,
    @JsonProperty(value = "REMOVE") REMOVE,
}
