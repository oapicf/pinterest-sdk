package org.openapitools.server.api.model

import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.Language
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdvancedAuctionKey(
    val country: Country,
    /** The catalog retail item id in the merchant namespace */
    val itemId: kotlin.String,
    val language: Language
)
