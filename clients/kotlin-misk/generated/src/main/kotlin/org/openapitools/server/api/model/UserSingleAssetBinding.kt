package org.openapitools.server.api.model

import org.openapitools.server.api.model.BusinessAccessUserSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserSingleAssetBinding(
    /** Permission levels member or partner has on an asset. */
    val permissions: kotlin.collections.List<kotlin.String>? = null,
    val user: BusinessAccessUserSummary? = null
)
