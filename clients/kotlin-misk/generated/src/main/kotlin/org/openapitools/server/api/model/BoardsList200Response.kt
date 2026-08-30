package org.openapitools.server.api.model

import org.openapitools.server.api.model.Board
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BoardsList200Response(
    val items: kotlin.collections.List<Board>,
    val bookmark: kotlin.String? = null
)
