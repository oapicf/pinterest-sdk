
package org.openapitools.client.model


case class CampaignCreateRequest (
    _bidOptions: Option[CampaignBidOptionsCreate],
    _intendedPromotionType: Option[IntendedPromotionType],
    /* Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES */
    _isAutomatedCampaign: Option[Boolean],
    /* Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. */
    _isCampaignBudgetOptimization: Option[Boolean],
    /* Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. */
    _isFlexibleDailyBudgets: Option[Boolean],
    /* Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. */
    _isLtvOptimized: Option[Boolean],
    /* Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. */
    _isPerformancePlus: Option[Boolean],
    /* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>. */
    _isTopOfSearch: Option[Boolean],
    _objectiveType: ObjectiveType,
    _status: Option[EntityStatus],
    /* Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. */
    _adAccountId: String,
    /* Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. */
    _dailySpendCap: Option[Integer],
    /* When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. */
    _defaultAdGroupBudgetInMicroCurrency: Option[Integer],
    /* Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. */
    _endTime: Option[Integer],
    /* Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. */
    _lifetimeSpendCap: Option[Integer],
    /* Campaign name. */
    _name: String,
    /* Order line ID that appears on the invoice. */
    _orderLineId: Option[String],
    /* Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. */
    _startTime: Option[Integer],
    _trackingUrls: Option[Any]
)
object CampaignCreateRequest {
    def toStringBody(var_bidOptions: Object, var_intendedPromotionType: Object, var_isAutomatedCampaign: Object, var_isCampaignBudgetOptimization: Object, var_isFlexibleDailyBudgets: Object, var_isLtvOptimized: Object, var_isPerformancePlus: Object, var_isTopOfSearch: Object, var_objectiveType: Object, var_status: Object, var_adAccountId: Object, var_dailySpendCap: Object, var_defaultAdGroupBudgetInMicroCurrency: Object, var_endTime: Object, var_lifetimeSpendCap: Object, var_name: Object, var_orderLineId: Object, var_startTime: Object, var_trackingUrls: Object) =
        s"""
        | {
        | "bidOptions":$var_bidOptions,"intendedPromotionType":$var_intendedPromotionType,"isAutomatedCampaign":$var_isAutomatedCampaign,"isCampaignBudgetOptimization":$var_isCampaignBudgetOptimization,"isFlexibleDailyBudgets":$var_isFlexibleDailyBudgets,"isLtvOptimized":$var_isLtvOptimized,"isPerformancePlus":$var_isPerformancePlus,"isTopOfSearch":$var_isTopOfSearch,"objectiveType":$var_objectiveType,"status":$var_status,"adAccountId":$var_adAccountId,"dailySpendCap":$var_dailySpendCap,"defaultAdGroupBudgetInMicroCurrency":$var_defaultAdGroupBudgetInMicroCurrency,"endTime":$var_endTime,"lifetimeSpendCap":$var_lifetimeSpendCap,"name":$var_name,"orderLineId":$var_orderLineId,"startTime":$var_startTime,"trackingUrls":$var_trackingUrls
        | }
        """.stripMargin
}
