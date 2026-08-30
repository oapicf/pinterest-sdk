package org.openapitools.server.api.model

import org.openapitools.server.api.model.KeywordUpdateItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordsUpdate(
    /** Keywords */
    val keywords: kotlin.collections.List<KeywordUpdateItem>? = null
)
