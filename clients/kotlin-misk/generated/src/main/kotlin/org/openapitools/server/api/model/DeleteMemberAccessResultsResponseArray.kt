package org.openapitools.server.api.model

import org.openapitools.server.api.model.DeleteMemberAccessResult
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeleteMemberAccessResultsResponseArray(
    /** List of member asset permissions that were deleted. */
    val items: kotlin.collections.List<DeleteMemberAccessResult>? = null
)
