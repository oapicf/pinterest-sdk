package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignAdPreviewCreate200ResponseInnerData
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignAdPreviewCreate200ResponseInner(
    val `data`: CampaignAdPreviewCreate200ResponseInnerData
)
