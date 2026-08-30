package org.openapitools.server.api.model

import org.openapitools.server.api.model.ImageMetadata
import org.openapitools.server.api.model.ImageSize
import org.openapitools.server.api.model.VideoMetadataWithItemType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaMetadata(
    /** Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. */
    val itemType: kotlin.String,
    val description: kotlin.String? = null,
    val images: ImageSize? = null,
    val link: kotlin.String? = null,
    val title: kotlin.String? = null,
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
    val width: kotlin.Int? = null
)
