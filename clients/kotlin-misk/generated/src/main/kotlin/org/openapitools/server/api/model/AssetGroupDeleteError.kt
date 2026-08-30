package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssetGroupDeleteError(
    /** Asset group id of the exception. */
    val assetGroupId: kotlin.String? = null,
    /** Error code associated with the error deleting asset group. */
    val code: kotlin.Int? = null,
    /** Error message associated with the error deleting asset group. */
    val message: kotlin.String? = null
)
