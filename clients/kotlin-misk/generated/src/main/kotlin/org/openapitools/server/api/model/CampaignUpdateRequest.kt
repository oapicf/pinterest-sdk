package org.openapitools.server.api.model

import org.openapitools.server.api.model.CampaignBidOptionsUpdate
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.IntendedPromotionType
import org.openapitools.server.api.model.ObjectiveType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignUpdateRequest(
    /** Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. */
    val adAccountId: kotlin.String,
    /** Campaign ID. */
    val id: kotlin.String,
    val bidOptions: CampaignBidOptionsUpdate? = null,
    val intendedPromotionType: IntendedPromotionType? = null,
    /** Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. */
    val isLtvOptimized: kotlin.Boolean? = null,
    /** Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field. */
    val isPerformancePlus: kotlin.Boolean? = null,
    /** Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. */
    val isTopOfSearch: kotlin.Boolean? = null,
    val objectiveType: ObjectiveType? = null,
    /** Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. */
    val dailySpendCap: kotlin.Int? = null,
    /** When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. */
    val defaultAdGroupBudgetInMicroCurrency: kotlin.Int? = null,
    /** Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If &#x60;end_time&#x60; is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to &#x60;paused&#x60;. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different end times can be set for the campaign&#39;s child ad groups, but they cannot occur after an &#x60;end_time&#x60; specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an &#x60;end_time&#x60; that is earlier than that of the ad group, the campaign &#x60;end_time&#x60; will supersede the ad group &#x60;end_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. */
    val endTime: kotlin.Int? = null,
    /** Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES */
    val isAutomatedCampaign: kotlin.Boolean? = null,
    /** Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. */
    val isCampaignBudgetOptimization: kotlin.Boolean? = null,
    /** Determine if a campaign has setup for flexible daily budgets, also known as \&quot;Pinterest Performance+ budgets\&quot;. Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. */
    val isFlexibleDailyBudgets: kotlin.Boolean? = null,
    /** Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. */
    val lifetimeSpendCap: kotlin.Int? = null,
    /** Campaign name. */
    val name: kotlin.String? = null,
    /** Order line ID that appears on the invoice. */
    val orderLineId: kotlin.String? = null,
    /** Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about &lt;a href&#x3D;\&quot;/docs/api-features/managing-campaigns/#campaign-scheduling\&quot; target&#x3D;\&quot;blank\&quot;&gt;scheduling campaigns&lt;/a&gt;. Different start times can be set for the campaign&#39;s child ad groups, but they cannot occur before a &#x60;start_time&#x60; specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a &#x60;start_time&#x60; that is later than that of the ad group, the campaign &#x60;start_time&#x60; will supersede the ad group &#x60;start_time&#x60;, and the request will not return an error. - In this scenario, if you call &lt;a href&#x3D;\&quot;/docs/api/v5/campaigns-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List campaigns&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/api/v5/ad_groups-list\&quot; target&#x3D;\&quot;blank\&quot;&gt;List ad groups&lt;/a&gt;, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. */
    val startTime: kotlin.Int? = null,
    val status: EntityStatus? = null,
    val trackingUrls: kotlin.Any? = null
)
