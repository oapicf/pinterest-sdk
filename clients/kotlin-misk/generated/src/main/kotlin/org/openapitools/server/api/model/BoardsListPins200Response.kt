package org.openapitools.server.api.model

import org.openapitools.server.api.model.PinRead
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BoardsListPins200Response(
    val items: kotlin.collections.List<PinRead>,
    val bookmark: kotlin.String? = null
)
