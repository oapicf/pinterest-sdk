@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class MsotEventName {
    @JsonProperty(value = "add_to_cart") add_to_cart,
    @JsonProperty(value = "checkout") checkout,
    @JsonProperty(value = "lead") lead,
    @JsonProperty(value = "signup") signup,
}
