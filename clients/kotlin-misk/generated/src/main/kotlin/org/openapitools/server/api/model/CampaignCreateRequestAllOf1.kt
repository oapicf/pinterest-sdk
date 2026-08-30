package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignBidOptionsCreate
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.IntendedPromotionType
import org.openapitools.server.api.model.ObjectiveType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignCreateRequestAllOf1(
    val objectiveType: ObjectiveType,
    val bidOptions: CampaignBidOptionsCreate? = null,
    val intendedPromotionType: IntendedPromotionType? = null,
    /** Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES */
    val isAutomatedCampaign: kotlin.Boolean? = null,
    /** Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. */
    val isCampaignBudgetOptimization: kotlin.Boolean? = null,
    /** Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. */
    val isFlexibleDailyBudgets: kotlin.Boolean? = null,
    /** Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. */
    val isLtvOptimized: kotlin.Boolean? = null,
    /** Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. */
    val isPerformancePlus: kotlin.Boolean? = false,
    /** &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Restricted&lt;/a&gt;  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: &#x60;CONSIDERATION&#x60; &#x60;WEB_CONVERSION&#x60; &#x60;CATALOG_SALES&#x60;  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your &#x60;true&#x60; or &#x60;false&#x60; selection of this campaign if you &lt;a href&#x3D;\&quot;https://developer.pinterest.com/docs/api/v5/campaigns-update\&quot; target&#x3D;\&quot;blank\&quot;&gt;update it&lt;/a&gt;. */
    val isTopOfSearch: kotlin.Boolean? = false,
    val status: EntityStatus? = null
)
