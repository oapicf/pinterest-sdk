package org.openapitools.server.api.model

import org.openapitools.server.api.model.Label
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabelsList200Response(
    val items: kotlin.collections.List<Label>,
    val bookmark: kotlin.String? = null
)
