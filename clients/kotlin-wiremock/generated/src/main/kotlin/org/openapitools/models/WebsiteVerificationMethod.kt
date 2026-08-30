@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class WebsiteVerificationMethod {
    @JsonProperty(value = "FILENAME") FILENAME,
    @JsonProperty(value = "METATAG") METATAG,
    @JsonProperty(value = "DNSTXT") DNSTXT,
}
