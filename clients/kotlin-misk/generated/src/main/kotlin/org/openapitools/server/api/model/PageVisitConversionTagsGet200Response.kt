package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionEventResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PageVisitConversionTagsGet200Response(
    val items: kotlin.collections.List<ConversionEventResponse>,
    val bookmark: kotlin.String? = null
)
