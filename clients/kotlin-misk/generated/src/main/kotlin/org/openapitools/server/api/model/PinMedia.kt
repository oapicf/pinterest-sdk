package org.openapitools.server.api.model

import org.openapitools.server.api.model.ImageSize
import org.openapitools.server.api.model.PinMediaMetadata
import org.openapitools.server.api.model.PinMediaWithImage
import org.openapitools.server.api.model.PinMediaWithImageAndVideo
import org.openapitools.server.api.model.PinMediaWithImages
import org.openapitools.server.api.model.PinMediaWithVideo
import org.openapitools.server.api.model.PinMediaWithVideos
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMedia(
    val mediaType: kotlin.String,
    val images: ImageSize? = null,
    val coverImageUrl: kotlin.String? = null,
    /** Duration (in miliseconds). Field maybe null after creation due to video processing time. */
    val duration: java.math.BigDecimal? = null,
    /** Height (in pixels). Field maybe null after creation due to video processing time. */
    val height: kotlin.Int? = null,
    /** Video url (720p).  **Note:** This field is limited and not available to all apps. */
    val videoUrl: kotlin.String? = null,
    /** Video url (HLS).  **Note:** This field is limited and not available to all apps. */
    val videoUrlHls: kotlin.String? = null,
    /** Width (in pixels). Field maybe null after creation due to video processing time. */
    val width: kotlin.Int? = null,
    val items: kotlin.collections.List<PinMediaMetadata>? = null
)
