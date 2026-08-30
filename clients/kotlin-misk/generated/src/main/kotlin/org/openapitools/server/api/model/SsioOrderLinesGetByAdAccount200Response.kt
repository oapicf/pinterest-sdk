package org.openapitools.server.api.model

import org.openapitools.server.api.model.SSIOOrderLine
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SsioOrderLinesGetByAdAccount200Response(
    val items: kotlin.collections.List<SSIOOrderLine>,
    val bookmark: kotlin.String? = null
)
