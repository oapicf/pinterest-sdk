@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Media(
    @field:JsonProperty("media_id")
    val mediaId: kotlin.String,

    @field:JsonProperty("media_type")
    val mediaType: MediaUploadType,

    @field:JsonProperty("status")
    val status: MediaUploadStatus? = null,

)
