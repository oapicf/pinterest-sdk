package org.openapitools.server.api.model

import org.openapitools.server.api.model.DeletePartnerAssetAccessItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeletePartnerAssetAccessBody(
    /** List of partner asset accesses to delete. */
    val accesses: kotlin.collections.List<DeletePartnerAssetAccessItem>
)
