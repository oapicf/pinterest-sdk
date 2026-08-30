package org.openapitools.server.api.model

import org.openapitools.server.api.model.InviteType
import org.openapitools.server.api.model.Permissions
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateAssetInvitesRequestItem(
    /** An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. */
    val assetIdToPermissions: kotlin.collections.Map<kotlin.String, kotlin.collections.List<Permissions>>,
    /** Unique identifier of an invite. */
    val inviteId: kotlin.String,
    val inviteType: InviteType
)
