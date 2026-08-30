package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignAdPreviewDelete200ResponseInnerStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsLocalStoresDelete200ResponseInner(
    /** The ID of the local store. */
    val id: kotlin.String,
    val status: CampaignAdPreviewDelete200ResponseInnerStatus
)
