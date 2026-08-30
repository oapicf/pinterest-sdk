@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateAssetInvitesRequestItem(
    @field:JsonProperty("asset_id_to_permissions")
    val assetIdToPermissions: kotlin.collections.Map<kotlin.String, kotlin.collections.List<Permissions>>,

    @field:JsonProperty("invite_id")
    val inviteId: kotlin.String,

    @field:JsonProperty("invite_type")
    val inviteType: InviteType,

)
