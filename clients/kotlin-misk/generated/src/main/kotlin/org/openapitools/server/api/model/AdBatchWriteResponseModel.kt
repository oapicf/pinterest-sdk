package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdBatchItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdBatchWriteResponseModel(
    val items: kotlin.collections.List<AdBatchItem>
)
