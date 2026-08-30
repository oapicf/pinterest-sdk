package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptions;
import org.openapitools.model.CampaignObjectiveType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.PerformancePlusCampaignSettings;
import org.openapitools.model.SummaryStatus;
import org.openapitools.model.TrackingUrls;

@Canonical
class Campaign {
    /* Campaign's Advertiser ID. */
    String adAccountId
    /* [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers. */
    CampaignBidOptions bidOptions
    /* Campaign creation time. Unix timestamp in seconds. */
    Integer createdTime
    /* Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. */
    Integer dailySpendCap
    /* When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. */
    Integer defaultAdGroupBudgetInMicroCurrency
    /* Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. */
    Integer endTime
    /* Campaign ID, must be associated with the ad account ID provided in the path. */
    String id
    
    IntendedPromotionType intendedPromotionType
    /* Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES */
    Boolean isAutomatedCampaign
    /* Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. */
    Boolean isCampaignBudgetOptimization
    /* Whether the campaign contains a carting(where-to-buy link) ad. */
    Boolean isCarting
    /* Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. */
    Boolean isFlexibleDailyBudgets
    /* Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. */
    Boolean isLtvOptimized
    /* Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) */
    Boolean isPerformancePlus
    /* Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. */
    Boolean isTopOfSearch
    /* Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. */
    Integer lifetimeSpendCap
    /* Campaign name - 255 chars max. */
    String name
    
    CampaignObjectiveType objectiveType
    /* Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. */
    String orderLineId
    /* Pinterest Performance+ campaign settings. */
    PerformancePlusCampaignSettings performancePlusCampaignSettings
    /* Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. */
    Integer startTime
    
    EntityStatus status
    
    SummaryStatus summaryStatus
    
    TrackingUrls trackingUrls
    /* Always \"campaign\". */
    String type
    /* UTC timestamp. Last update time. */
    Integer updatedTime
}
