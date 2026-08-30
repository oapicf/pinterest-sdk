package org.openapitools.server.api.model

import org.openapitools.server.api.model.ImageSize
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaWithVideo(
    val mediaType: kotlin.String,
    val coverImageUrl: kotlin.String? = null,
    /** Duration (in miliseconds). Field maybe null after creation due to video processing time. */
    val duration: java.math.BigDecimal? = null,
    /** Height (in pixels). Field maybe null after creation due to video processing time. */
    val height: kotlin.Int? = null,
    val images: ImageSize? = null,
    /** Video url (720p).  **Note:** This field is limited and not available to all apps. */
    val videoUrl: kotlin.String? = null,
    /** Video url (HLS).  **Note:** This field is limited and not available to all apps. */
    val videoUrlHls: kotlin.String? = null,
    /** Width (in pixels). Field maybe null after creation due to video processing time. */
    val width: kotlin.Int? = null
)
