@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class IngestionSource {
    @JsonProperty(value = "TAG") TAG,
    @JsonProperty(value = "MMP") MMP,
    @JsonProperty(value = "FILE_UPLOAD") FILE_UPLOAD,
    @JsonProperty(value = "CONVERSIONS_API") CONVERSIONS_API,
    @JsonProperty(value = "NATIVE") NATIVE,
}
