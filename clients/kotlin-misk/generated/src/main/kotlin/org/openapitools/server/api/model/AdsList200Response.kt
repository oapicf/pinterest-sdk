package org.openapitools.server.api.model

import org.openapitools.server.api.model.Ad
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdsList200Response(
    val items: kotlin.collections.List<Ad>,
    val bookmark: kotlin.String? = null
)
