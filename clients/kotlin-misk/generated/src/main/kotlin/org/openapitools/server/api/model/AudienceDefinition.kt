package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AudienceDefinition(
    /** Generation date */
    val date: kotlin.String? = null,
    val scope: kotlin.String? = null,
    val type: kotlin.String? = null
)
