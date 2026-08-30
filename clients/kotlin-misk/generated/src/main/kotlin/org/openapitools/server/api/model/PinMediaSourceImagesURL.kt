package org.openapitools.server.api.model

import org.openapitools.server.api.model.PinMediaSourceImagesURLItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaSourceImagesURL(
    /** Array with image objects. */
    val items: kotlin.collections.List<PinMediaSourceImagesURLItem>,
    /** The source type of the media. */
    val sourceType: kotlin.String,
    val index: kotlin.Int? = null
)
