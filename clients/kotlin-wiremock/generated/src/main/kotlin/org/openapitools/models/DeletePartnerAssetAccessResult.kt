@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeletePartnerAssetAccessResult(
    @field:JsonProperty("asset_id")
    val assetId: kotlin.String? = null,

    @field:JsonProperty("asset_type")
    val assetType: kotlin.String? = null,

    @field:JsonProperty("is_shared_partner")
    val isSharedPartner: kotlin.Boolean? = null,

    @field:JsonProperty("partner_id")
    val partnerId: kotlin.String? = null,

    @field:JsonProperty("permissions")
    val permissions: kotlin.collections.List<kotlin.String>? = null,

)
