package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignAdPreview(
    /** Advertiser ID for this preview. */
    val adAccountId: kotlin.String,
    /** Ad group ID to create a preview record for. */
    val adGroupId: kotlin.String,
    /** Unix timestamp in milliseconds for preview expiration. */
    val expiresAt: kotlin.Int,
    /** Whether preview link is active. */
    val isActive: kotlin.Boolean,
    /** Campaign ad preview URL. */
    val url: kotlin.String,
    /** User ID that created preview. */
    val userId: kotlin.Int,
    /** Pin promotion preview key. */
    val uuid: kotlin.String,
    /** Client ID that created preview. */
    val clientId: kotlin.Int? = null,
    /** Pin ID for pin promotion preview. */
    val pinId: kotlin.Int? = null,
    /** Pin promotion ID for this preview. */
    val pinPromotionId: kotlin.Int? = null,
    /** Promoted product group ID for catalog previews. */
    val promotedProductGroupId: kotlin.Int? = null
)
