
package org.openapitools.client.model


case class CampaignCreateRequestAllOf1 (
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
    _status: Option[EntityStatus]
)
object CampaignCreateRequestAllOf1 {
    def toStringBody(var_bidOptions: Object, var_intendedPromotionType: Object, var_isAutomatedCampaign: Object, var_isCampaignBudgetOptimization: Object, var_isFlexibleDailyBudgets: Object, var_isLtvOptimized: Object, var_isPerformancePlus: Object, var_isTopOfSearch: Object, var_objectiveType: Object, var_status: Object) =
        s"""
        | {
        | "bidOptions":$var_bidOptions,"intendedPromotionType":$var_intendedPromotionType,"isAutomatedCampaign":$var_isAutomatedCampaign,"isCampaignBudgetOptimization":$var_isCampaignBudgetOptimization,"isFlexibleDailyBudgets":$var_isFlexibleDailyBudgets,"isLtvOptimized":$var_isLtvOptimized,"isPerformancePlus":$var_isPerformancePlus,"isTopOfSearch":$var_isTopOfSearch,"objectiveType":$var_objectiveType,"status":$var_status
        | }
        """.stripMargin
}
