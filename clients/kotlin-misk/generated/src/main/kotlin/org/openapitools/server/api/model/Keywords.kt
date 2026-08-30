package org.openapitools.server.api.model

import org.openapitools.server.api.model.Keyword
import org.openapitools.server.api.model.KeywordError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Keywords(
    /** Keyword error */
    val errors: kotlin.collections.List<KeywordError>,
    /** Keywords */
    val keywords: kotlin.collections.List<Keyword>
)
