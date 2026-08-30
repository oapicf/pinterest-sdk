package org.openapitools.server.api.model

import org.openapitools.server.api.model.PinMediaSourceImagesBase64Item
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaSourceImagesBase64(
    /** Array with image objects. */
    val items: kotlin.collections.List<PinMediaSourceImagesBase64Item>,
    /** The source type of the media. */
    val sourceType: kotlin.String,
    val index: kotlin.Int? = null
)
