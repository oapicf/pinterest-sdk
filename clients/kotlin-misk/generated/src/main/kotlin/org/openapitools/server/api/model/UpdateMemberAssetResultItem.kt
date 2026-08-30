package org.openapitools.server.api.model

import org.openapitools.server.api.model.UsersForIndividualAssetResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpdateMemberAssetResultItem(
    val response: UsersForIndividualAssetResponse? = null
)
