package org.openapitools.server.api.model

import org.openapitools.server.api.model.FollowUser
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FollowersList200Response(
    val items: kotlin.collections.List<FollowUser>,
    val bookmark: kotlin.String? = null
)
