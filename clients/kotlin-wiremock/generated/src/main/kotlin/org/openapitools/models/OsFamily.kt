@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class OsFamily {
    @JsonProperty(value = "ios") ios,
    @JsonProperty(value = "android") android,
    @JsonProperty(value = "macos") macos,
    @JsonProperty(value = "windows") windows,
    @JsonProperty(value = "linux") linux,
    @JsonProperty(value = "bsd") bsd,
    @JsonProperty(value = "other") other,
}
