package org.openapitools.server.api.model

import org.openapitools.server.api.model.UpdateMemberAssetAccessItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpdateMemberAssetAccessBody(
    /** List of member asset accesses to assign or update. */
    val accesses: kotlin.collections.List<UpdateMemberAssetAccessItem>
)
