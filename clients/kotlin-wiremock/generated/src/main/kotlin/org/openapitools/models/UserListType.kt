@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class UserListType {
    @JsonProperty(value = "EMAIL") EMAIL,
    @JsonProperty(value = "IDFA") IDFA,
    @JsonProperty(value = "MAID") MAID,
    @JsonProperty(value = "LR_ID") LR_ID,
    @JsonProperty(value = "DLX_ID") DLX_ID,
    @JsonProperty(value = "HASHED_PINNER_ID") HASHED_PINNER_ID,
}
