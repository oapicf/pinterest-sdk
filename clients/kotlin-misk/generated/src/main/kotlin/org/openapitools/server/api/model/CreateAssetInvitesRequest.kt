package org.openapitools.server.api.model

import org.openapitools.server.api.model.CreateAssetInvitesRequestItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateAssetInvitesRequest(
    val invites: kotlin.collections.List<CreateAssetInvitesRequestItem>
)
