@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignAdPreviewCreate200ResponseInnerData(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String,

    @field:JsonProperty("ad_group_id")
    val adGroupId: kotlin.String,

    @field:JsonProperty("expires_at")
    val expiresAt: kotlin.Int,

    @field:JsonProperty("is_active")
    val isActive: kotlin.Boolean,

    @field:JsonProperty("url")
    val url: kotlin.String,

    @field:JsonProperty("user_id")
    val userId: kotlin.Int,

    @field:JsonProperty("uuid")
    val uuid: kotlin.String,

    @field:JsonProperty("exceptions")
    val exceptions: PinterestLibError,

    @field:JsonProperty("client_id")
    val clientId: kotlin.Int? = null,

    @field:JsonProperty("pin_id")
    val pinId: kotlin.Int? = null,

    @field:JsonProperty("pin_promotion_id")
    val pinPromotionId: kotlin.Int? = null,

    @field:JsonProperty("promoted_product_group_id")
    val promotedProductGroupId: kotlin.Int? = null,

)
