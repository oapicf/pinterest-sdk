package org.openapitools.server.api.model

import org.openapitools.server.api.model.ContentType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaSourceVideoID(
    val mediaId: kotlin.String,
    val sourceType: kotlin.String,
    /** Content type for cover image Base64. */
    val coverImageContentType: ContentType? = null,
    /** Cover image Base64. */
    val coverImageData: kotlin.String? = null,
    /** Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. */
    val coverImageKeyFrameTime: kotlin.Int? = null,
    /** Cover image URL. */
    val coverImageUrl: kotlin.String? = null,
    /** Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    val isStandard: kotlin.Boolean? = true
)
