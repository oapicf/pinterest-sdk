package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateAssetAccessRequestItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateAssetAccessRequestBody(
    val assetRequests: kotlin.collections.List<CreateAssetAccessRequestItem>
)
