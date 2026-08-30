package org.openapitools.server.api.model

import org.openapitools.server.api.model.DeleteMemberAssetAccessItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BusinessMembersAssetAccessDeleteBody(
    /** List of members asset access to be deleted */
    val accesses: kotlin.collections.List<DeleteMemberAssetAccessItem>
)
