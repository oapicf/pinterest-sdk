package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeleteMemberAccessResult(
    /** Unique identifier of the business asset. */
    val assetId: kotlin.String? = null,
    /** Unique identifier of the business member. */
    val memberId: kotlin.String? = null
)
