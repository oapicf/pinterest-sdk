@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class MediaUploadStatus {
    @JsonProperty(value = "registered") registered,
    @JsonProperty(value = "processing") processing,
    @JsonProperty(value = "succeeded") succeeded,
    @JsonProperty(value = "failed") failed,
}
