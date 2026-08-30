package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionTag
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionTagsList200Response(
    val items: kotlin.collections.List<ConversionTag>
)
