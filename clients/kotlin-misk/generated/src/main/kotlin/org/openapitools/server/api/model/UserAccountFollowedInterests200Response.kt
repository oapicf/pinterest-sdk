package org.openapitools.server.api.model

import org.openapitools.server.api.model.Interest
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserAccountFollowedInterests200Response(
    val items: kotlin.collections.List<Interest>,
    val bookmark: kotlin.String? = null
)
