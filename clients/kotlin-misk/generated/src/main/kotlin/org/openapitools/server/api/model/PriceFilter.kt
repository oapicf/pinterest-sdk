package org.openapitools.server.api.model

import org.openapitools.server.api.model.PriceFilterPrice
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PriceFilter(
    val PRICE: PriceFilterPrice
)
