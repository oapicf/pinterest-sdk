package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdPreviewSourceImage(
    /** Image URL. */
    val imageUrl: kotlin.String,
    /** Title displayed below ad. */
    val title: kotlin.String,
    /** Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. */
    val promotionId: kotlin.String? = null
)
