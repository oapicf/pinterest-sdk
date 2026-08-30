package org.openapitools.server.api.model

import org.openapitools.server.api.model.InviteResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetInvites200Response(
    val items: kotlin.collections.List<InviteResponse>,
    val bookmark: kotlin.String? = null
)
