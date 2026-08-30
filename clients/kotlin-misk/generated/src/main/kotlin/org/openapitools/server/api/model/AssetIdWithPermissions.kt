package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssetIdWithPermissions(
    /** Unique identifier of a business asset. */
    val id: kotlin.String? = null,
    /** Permission levels member or partner has on an asset. */
    val permissions: kotlin.collections.List<kotlin.String>? = null
)
