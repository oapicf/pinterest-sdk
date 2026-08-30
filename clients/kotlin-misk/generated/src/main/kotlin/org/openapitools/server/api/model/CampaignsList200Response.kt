package org.openapitools.server.api.model

import org.openapitools.server.api.model.Campaign
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignsList200Response(
    val items: kotlin.collections.List<Campaign>,
    val bookmark: kotlin.String? = null
)
