@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class MediaUploadCreate(
    @field:JsonProperty("media_type")
    val mediaType: MediaUploadType,

)
