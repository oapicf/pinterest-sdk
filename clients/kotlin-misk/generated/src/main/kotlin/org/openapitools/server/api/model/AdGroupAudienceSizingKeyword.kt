package org.openapitools.server.api.model

import org.openapitools.server.api.model.MatchType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdGroupAudienceSizingKeyword(
    val matchType: MatchType,
    /** Keyword value (120 chars max). */
    val `value`: kotlin.String
)
