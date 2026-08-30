@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class MediaType {
    @JsonProperty(value = "IMAGE") IMAGE,
    @JsonProperty(value = "VIDEO") VIDEO,
}
