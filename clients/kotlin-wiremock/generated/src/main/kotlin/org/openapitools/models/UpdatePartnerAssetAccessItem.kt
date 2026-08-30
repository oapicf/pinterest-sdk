@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdatePartnerAssetAccessItem(
    @field:JsonProperty("asset_id")
    val assetId: kotlin.String,

    @field:JsonProperty("partner_id")
    val partnerId: kotlin.String,

    @field:JsonProperty("permissions")
    val permissions: kotlin.collections.List<Permissions>,

)
