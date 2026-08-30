package org.openapitools.server.api.model

import org.openapitools.server.api.model.UpdatePartnerAssetAccessItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpdatePartnerAssetAccessBody(
    /** List of partner asset accesses to assign or update. */
    val accesses: kotlin.collections.List<UpdatePartnerAssetAccessItem>
)
