package org.openapitools.server.api.model

import org.openapitools.server.api.model.Keyword
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordsGet200Response(
    val items: kotlin.collections.List<Keyword>,
    val bookmark: kotlin.String? = null
)
