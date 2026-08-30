package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdsCreditDiscountsResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdsCreditsDiscountsGet200Response(
    val items: kotlin.collections.List<AdsCreditDiscountsResponse>,
    val bookmark: kotlin.String? = null
)
