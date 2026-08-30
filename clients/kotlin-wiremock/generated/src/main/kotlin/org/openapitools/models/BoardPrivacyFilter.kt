@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BoardPrivacyFilter {
    @JsonProperty(value = "ALL") ALL,
    @JsonProperty(value = "PUBLIC") PUBLIC,
    @JsonProperty(value = "PROTECTED") PROTECTED,
    @JsonProperty(value = "SECRET") SECRET,
    @JsonProperty(value = "PUBLIC_AND_SECRET") PUBLIC_AND_SECRET,
}
