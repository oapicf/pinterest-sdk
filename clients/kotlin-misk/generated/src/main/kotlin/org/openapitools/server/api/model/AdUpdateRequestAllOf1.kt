package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdUpdateRequestAllOf1(
    /** The ID of this ad. */
    val id: kotlin.String,
    /** Pin ID. This field may only be updated for draft ads. */
    val pinId: kotlin.String? = null
)
