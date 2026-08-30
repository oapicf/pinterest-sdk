package org.openapitools.server.api.model

import org.openapitools.server.api.model.KeywordCreateItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordsCreate(
    /** Keywords */
    val keywords: kotlin.collections.List<KeywordCreateItem>,
    /** Keyword data */
    val parentId: kotlin.String
)
