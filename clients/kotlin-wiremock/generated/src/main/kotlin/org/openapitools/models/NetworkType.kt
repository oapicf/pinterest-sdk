@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class NetworkType {
    @JsonProperty(value = "wifi") wifi,
    @JsonProperty(value = "cellular_2g") cellular_2g,
    @JsonProperty(value = "cellular_3g") cellular_3g,
    @JsonProperty(value = "cellular_4g") cellular_4g,
    @JsonProperty(value = "cellular_5g") cellular_5g,
    @JsonProperty(value = "cellular_6g") cellular_6g,
    @JsonProperty(value = "ethernet") ethernet,
    @JsonProperty(value = "unknown") unknown,
}
