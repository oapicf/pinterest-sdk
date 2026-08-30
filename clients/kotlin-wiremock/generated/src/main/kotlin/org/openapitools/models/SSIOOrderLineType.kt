@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class SSIOOrderLineType {
    @JsonProperty(value = "BUDGET") BUDGET,
    @JsonProperty(value = "PERPETUALS") PERPETUALS,
}
