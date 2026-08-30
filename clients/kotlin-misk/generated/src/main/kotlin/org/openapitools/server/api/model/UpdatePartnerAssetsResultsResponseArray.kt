package org.openapitools.server.api.model

import org.openapitools.server.api.model.UpdatePartnerAssetsResult
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpdatePartnerAssetsResultsResponseArray(
    /** List of assigned/updated partner asset access. */
    val items: kotlin.collections.List<UpdatePartnerAssetsResult>? = null
)
