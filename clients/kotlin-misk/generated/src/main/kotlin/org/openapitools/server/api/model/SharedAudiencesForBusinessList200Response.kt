package org.openapitools.server.api.model

import org.openapitools.server.api.model.Audience
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SharedAudiencesForBusinessList200Response(
    val items: kotlin.collections.List<Audience>,
    val bookmark: kotlin.String? = null
)
