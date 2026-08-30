package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdPinPreviewCreativeType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdPreviewSourcePinId(
    /** Pin ID. */
    val pinId: kotlin.String,
    /** Creative type of the ad preview. */
    val creativeType: AdPinPreviewCreativeType? = null
)
