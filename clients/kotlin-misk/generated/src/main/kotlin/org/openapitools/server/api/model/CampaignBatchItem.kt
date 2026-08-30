package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignBatchResponseData
import org.openapitools.server.api.model.Exception
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignBatchItem(
    /** Campaign data on success. */
    val `data`: CampaignBatchResponseData? = null,
    /** Exceptions on failure. */
    val exceptions: kotlin.collections.List<Exception>? = null
)
