package org.openapitools.server.api.model

import org.openapitools.server.api.model.CancelInviteResultItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CancelInvitesResponse(
    val items: kotlin.collections.List<CancelInviteResultItem>? = null
)
