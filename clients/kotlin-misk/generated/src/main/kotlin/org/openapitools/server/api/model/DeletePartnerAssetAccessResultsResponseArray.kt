package org.openapitools.server.api.model

import org.openapitools.server.api.model.DeletePartnerAssetAccessResult
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeletePartnerAssetAccessResultsResponseArray(
    /** List of terminated partner asset accesses. */
    val items: kotlin.collections.List<DeletePartnerAssetAccessResult>? = null
)
