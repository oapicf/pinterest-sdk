package org.openapitools.server.api.model

import org.openapitools.server.api.model.MediaUploadType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MediaUploadCreate(
    val mediaType: MediaUploadType
)
