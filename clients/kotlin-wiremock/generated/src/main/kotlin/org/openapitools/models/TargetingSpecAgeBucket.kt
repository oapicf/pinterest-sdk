@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TargetingSpecAgeBucket {
    @JsonProperty(value = "18-24") _18Minus24,
    @JsonProperty(value = "19+") _19Plus,
    @JsonProperty(value = "20+") _20Plus,
    @JsonProperty(value = "21+") _21Plus,
    @JsonProperty(value = "25-34") _25Minus34,
    @JsonProperty(value = "35-44") _35Minus44,
    @JsonProperty(value = "45-49") _45Minus49,
    @JsonProperty(value = "50-54") _50Minus54,
    @JsonProperty(value = "55-64") _55Minus64,
    @JsonProperty(value = "65+") _65Plus,
}
