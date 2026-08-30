package org.openapitools.server.api.model

import org.openapitools.server.api.model.MediaUploadStatus
import org.openapitools.server.api.model.MediaUploadType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Media(
    /** Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */
    val mediaId: kotlin.String,
    val mediaType: MediaUploadType,
    val status: MediaUploadStatus? = null
)
