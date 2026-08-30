package org.openapitools.server.api.model

import org.openapitools.server.api.model.BulkCampaignDeliveryEstimatesItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BulkCampaignDeliveryEstimatesResponse(
    /** Per-campaign delivery estimate results, in the same order as the request. */
    val `data`: kotlin.collections.List<BulkCampaignDeliveryEstimatesItem>
)
