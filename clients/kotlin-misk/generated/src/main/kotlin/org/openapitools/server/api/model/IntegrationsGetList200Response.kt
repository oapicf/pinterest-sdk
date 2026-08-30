package org.openapitools.server.api.model

import org.openapitools.server.api.model.IntegrationRecord
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IntegrationsGetList200Response(
    val items: kotlin.collections.List<IntegrationRecord>,
    val bookmark: kotlin.String? = null
)
