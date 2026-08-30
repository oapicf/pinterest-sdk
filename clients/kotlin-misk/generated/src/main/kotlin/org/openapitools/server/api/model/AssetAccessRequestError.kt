package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssetAccessRequestError(
    /** Error code associated with the error in requesting asset access. */
    val code: kotlin.Int? = null,
    val messages: kotlin.collections.List<kotlin.String>? = null
)
