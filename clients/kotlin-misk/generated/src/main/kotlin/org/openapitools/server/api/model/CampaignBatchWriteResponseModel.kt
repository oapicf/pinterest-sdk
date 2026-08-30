package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignBatchItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignBatchWriteResponseModel(
    val items: kotlin.collections.List<CampaignBatchItem>
)
