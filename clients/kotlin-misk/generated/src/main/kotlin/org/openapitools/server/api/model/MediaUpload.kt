package org.openapitools.server.api.model

import org.openapitools.server.api.model.MediaUploadParameters
import org.openapitools.server.api.model.MediaUploadType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MediaUpload(
    /** Unique identifier for this media upload. Used to track status and for attaching during Pin creation. */
    val mediaId: kotlin.String,
    val mediaType: MediaUploadType,
    /** The list of parameter key/value pairs you will need to send with your POST request to upload your media file. */
    val uploadParameters: MediaUploadParameters? = null,
    /** The URL where you will POST your media file. */
    val uploadUrl: kotlin.String? = null
)
