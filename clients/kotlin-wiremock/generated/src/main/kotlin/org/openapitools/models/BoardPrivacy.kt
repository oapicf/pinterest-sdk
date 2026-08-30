@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BoardPrivacy {
    @JsonProperty(value = "PUBLIC") PUBLIC,
    @JsonProperty(value = "PROTECTED") PROTECTED,
    @JsonProperty(value = "SECRET") SECRET,
}
