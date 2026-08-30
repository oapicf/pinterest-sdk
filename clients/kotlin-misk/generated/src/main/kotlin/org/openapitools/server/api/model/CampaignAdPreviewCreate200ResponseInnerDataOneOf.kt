package org.openapitools.server.api.model

import org.openapitools.server.api.model.PinterestLibError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignAdPreviewCreate200ResponseInnerDataOneOf(
    val exceptions: PinterestLibError
)
