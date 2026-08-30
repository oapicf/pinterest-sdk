package org.openapitools.server.api.model

import org.openapitools.server.api.model.KeywordInfo
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrendsEditorial(
    /** URL of the editorial board */
    val boardUrl: kotlin.String,
    /** Description of the editorial article */
    val description: kotlin.String,
    /** List of interests related to the editorial article */
    val interests: kotlin.collections.List<kotlin.String>,
    /** URL of the pins related to the editorial article */
    val pinsUrl: kotlin.collections.List<kotlin.String>,
    /** List of keywords related to the editorial article */
    val relatedKeywords: kotlin.collections.List<KeywordInfo>,
    /** Title of the editorial article */
    val title: kotlin.String
)
