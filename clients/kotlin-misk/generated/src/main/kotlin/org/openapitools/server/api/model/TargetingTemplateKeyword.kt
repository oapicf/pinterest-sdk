package org.openapitools.server.api.model

import org.openapitools.server.api.model.MatchType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingTemplateKeyword(
    val matchType: MatchType? = null,
    /** The keyword targeting (120 chars max). */
    val `value`: kotlin.String? = null
)
