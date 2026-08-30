package org.openapitools.server.api.model

import org.openapitools.server.api.model.PinMedia
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SummaryPin(
    val id: kotlin.String,
    val altText: kotlin.String? = null,
    val description: kotlin.String? = null,
    val link: kotlin.String? = null,
    val media: PinMedia? = null,
    val title: kotlin.String? = null
)
