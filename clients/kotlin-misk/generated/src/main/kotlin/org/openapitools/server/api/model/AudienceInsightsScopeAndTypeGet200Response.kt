package org.openapitools.server.api.model

import org.openapitools.server.api.model.AudienceDefinition
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AudienceInsightsScopeAndTypeGet200Response(
    val items: kotlin.collections.List<AudienceDefinition>
)
