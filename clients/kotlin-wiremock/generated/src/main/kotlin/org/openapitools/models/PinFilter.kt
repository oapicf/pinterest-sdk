@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PinFilter {
    @JsonProperty(value = "exclude_native") exclude_native,
    @JsonProperty(value = "exclude_repins") exclude_repins,
    @JsonProperty(value = "has_been_promoted") has_been_promoted,
}
