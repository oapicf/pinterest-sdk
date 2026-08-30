
package org.openapitools.client.model


case class CampaignBatchUpdateItem (
    /* Setting this field does nothing. The ad account ID gets set from the path parameter. */
    _adAccountId: Option[String],
    /* [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns. */
    _appId: Option[String],
    /* [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for `APP_INSTALL` campaigns. */
    _appPlatform: Option[MobileAppPlatform],
    /* Object describing an update to the campaign level bid multipliers. */
    _bidOptions: Option[CampaignBidOptionsUpdate],
    /* Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. */
    _dailySpendCap: Option[Integer],
    /* Setting this field does nothing. */
    _defaultAdGroupBudgetInMicroCurrency: Option[Integer],
    /* Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. */
    _endTime: Option[Integer],
    /* Campaign ID, must be associated with the ad account ID provided in the path. */
    _id: String,
    _intendedPromotionType: Option[IntendedPromotionType],
    /* Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES */
    _isAutomatedCampaign: Option[Boolean],
    /* Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. */
    _isCampaignBudgetOptimization: Option[Boolean],
    /* Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. */
    _isFlexibleDailyBudgets: Option[Boolean],
    /* Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. */
    _isLtvOptimized: Option[Boolean],
    /* Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) */
    _isPerformancePlus: Option[Boolean],
    /* Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. */
    _isTopOfSearch: Option[Boolean],
    /* Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. */
    _lifetimeSpendCap: Option[Integer],
    /* Campaign name - 255 chars max. */
    _name: Option[String],
    _objectiveType: Option[ConversionObjectiveType],
    /* Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. */
    _orderLineId: Option[String],
    /* Pinterest Performance+ campaign settings. */
    _performancePlusCampaignSettings: Option[PerformancePlusCampaignSettings],
    /* Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. */
    _startTime: Option[Integer],
    _status: Option[EntityStatus],
    _trackingUrls: Option[TrackingUrls]
)
object CampaignBatchUpdateItem {
    def toStringBody(var_adAccountId: Object, var_appId: Object, var_appPlatform: Object, var_bidOptions: Object, var_dailySpendCap: Object, var_defaultAdGroupBudgetInMicroCurrency: Object, var_endTime: Object, var_id: Object, var_intendedPromotionType: Object, var_isAutomatedCampaign: Object, var_isCampaignBudgetOptimization: Object, var_isFlexibleDailyBudgets: Object, var_isLtvOptimized: Object, var_isPerformancePlus: Object, var_isTopOfSearch: Object, var_lifetimeSpendCap: Object, var_name: Object, var_objectiveType: Object, var_orderLineId: Object, var_performancePlusCampaignSettings: Object, var_startTime: Object, var_status: Object, var_trackingUrls: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"appId":$var_appId,"appPlatform":$var_appPlatform,"bidOptions":$var_bidOptions,"dailySpendCap":$var_dailySpendCap,"defaultAdGroupBudgetInMicroCurrency":$var_defaultAdGroupBudgetInMicroCurrency,"endTime":$var_endTime,"id":$var_id,"intendedPromotionType":$var_intendedPromotionType,"isAutomatedCampaign":$var_isAutomatedCampaign,"isCampaignBudgetOptimization":$var_isCampaignBudgetOptimization,"isFlexibleDailyBudgets":$var_isFlexibleDailyBudgets,"isLtvOptimized":$var_isLtvOptimized,"isPerformancePlus":$var_isPerformancePlus,"isTopOfSearch":$var_isTopOfSearch,"lifetimeSpendCap":$var_lifetimeSpendCap,"name":$var_name,"objectiveType":$var_objectiveType,"orderLineId":$var_orderLineId,"performancePlusCampaignSettings":$var_performancePlusCampaignSettings,"startTime":$var_startTime,"status":$var_status,"trackingUrls":$var_trackingUrls
        | }
        """.stripMargin
}
