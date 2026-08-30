package org.openapitools.server.api.model

import org.openapitools.server.api.model.UpdateMemberAssetResultItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpdateMemberAssetsResultsResponseArray(
    /** List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned. */
    val items: kotlin.collections.List<UpdateMemberAssetResultItem>? = null
)
