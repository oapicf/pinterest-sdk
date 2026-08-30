package org.openapitools.server.api.model

import org.openapitools.server.api.model.Pin
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinsList200Response(
    val items: kotlin.collections.List<Pin>,
    val bookmark: kotlin.String? = null
)
