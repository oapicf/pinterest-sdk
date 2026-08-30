package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FollowUser(
    /** Always &#39;user&#39; */
    val type: kotlin.String? = null,
    /** Username */
    val username: kotlin.String? = null
)
