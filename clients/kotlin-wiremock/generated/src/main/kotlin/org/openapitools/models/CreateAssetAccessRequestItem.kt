@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateAssetAccessRequestItem(
    @field:JsonProperty("asset_id_to_permissions")
    val assetIdToPermissions: kotlin.collections.Map<kotlin.String, kotlin.collections.List<Permissions>>,

    @field:JsonProperty("partner_id")
    val partnerId: kotlin.String,

)
