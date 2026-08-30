package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemsPost200Response(
    val items: kotlin.collections.List<ItemResponse>
)
