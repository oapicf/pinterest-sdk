@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AuthRespondInviteAction(
    @field:JsonProperty("accept_invite")
    val acceptInvite: kotlin.Boolean,

    @field:JsonProperty("asset_id_to_permissions")
    val assetIdToPermissions: kotlin.collections.Map<kotlin.String, kotlin.collections.List<Permissions>>? = null,

)
