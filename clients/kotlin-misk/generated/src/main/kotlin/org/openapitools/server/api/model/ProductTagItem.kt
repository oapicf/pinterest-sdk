package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductTagItem(
    /** Pin ID of the product pin to tag onto the hero pin. */
    val pinId: kotlin.String
)
