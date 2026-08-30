package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrendingPin(
    /** Dominant color of the pin image in hex format */
    val color: kotlin.String,
    /** Height of the pin image in pixels */
    val height: kotlin.Int,
    /** Unique identifier for the pin */
    val id: kotlin.String,
    /** URL of the pin image */
    val src: kotlin.String,
    /** Width of the pin image in pixels */
    val width: kotlin.Int,
    /** The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom. */
    val verticalOffset: kotlin.Double? = null
)
