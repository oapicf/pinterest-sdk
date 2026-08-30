package org.openapitools.server.api.model

import org.openapitools.server.api.model.TargetingTemplate
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingTemplateList200Response(
    val items: kotlin.collections.List<TargetingTemplate>,
    val bookmark: kotlin.String? = null
)
