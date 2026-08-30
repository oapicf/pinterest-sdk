package org.openapitools.server.api.model

import org.openapitools.server.api.model.BoardSection
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BoardSectionsList200Response(
    val items: kotlin.collections.List<BoardSection>,
    val bookmark: kotlin.String? = null
)
