package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignBidOptionsUpdate
import org.openapitools.server.api.model.IntendedPromotionType
import org.openapitools.server.api.model.ObjectiveType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignUpdateRequestAllOf2(
    val bidOptions: CampaignBidOptionsUpdate? = null,
    val intendedPromotionType: IntendedPromotionType? = null,
    /** Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. */
    val isLtvOptimized: kotlin.Boolean? = null,
    /** Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field. */
    val isPerformancePlus: kotlin.Boolean? = null,
    /** Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. */
    val isTopOfSearch: kotlin.Boolean? = null,
    val objectiveType: ObjectiveType? = null
)
