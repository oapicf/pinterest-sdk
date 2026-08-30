package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignAdPreviewCreate(
    /** Ad group ID to create a preview record for. */
    val adGroupId: kotlin.String
)
