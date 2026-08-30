@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BoardUpdatePrivacy {
    @JsonProperty(value = "PUBLIC") PUBLIC,
    @JsonProperty(value = "SECRET") SECRET,
}
