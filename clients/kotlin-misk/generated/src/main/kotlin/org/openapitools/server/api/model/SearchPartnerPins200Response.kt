package org.openapitools.server.api.model

import org.openapitools.server.api.model.SummaryPin
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchPartnerPins200Response(
    val items: kotlin.collections.List<SummaryPin>,
    val bookmark: kotlin.String? = null
)
